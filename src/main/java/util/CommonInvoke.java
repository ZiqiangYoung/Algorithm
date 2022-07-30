package util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class CommonInvoke {
    /**
     * <strong>按照列表内容链式调用方法</strong>
     * <br/>
     * <strong>目前该方法不支持重载的方法在一个调用列表内出现多个重载体</strong>
     * <p>Example:
     * <blockquote><pre>
     * Map&lt;String, Class&lt;?&gt;[]&gt; methodParamTypeMap = new HashMap&lt;&gt;();
     *
     * methodParamTypeMap.put("sum",
     *         new Class&lt;?&gt;[]{int.class, int.class});
     *
     * methodParamTypeMap.put("Adder",
     *         new Class&lt;?&gt;[0]);
     *
     * Object[] result = CommonInvoke.listInvoke(
     *         ParallelAdder.class,
     *         "[Adder, add, add, add]",
     *         "[[], [10, 20], [15, 25], [20, 30]]",
     *         Adder.class, methodParamTypeMap);
     *
     * // result:[null, true, true, true]
     * </blockquote></pre>
     *
     * @param implClazz                需要实例化并调用方法的类 如果希望调用的类是接口，则此处为实现类的类
     * @param invokeStrArrayStr        调用列表，其中出现的interfaceClazz类名意味着调用构造方法
     * @param paramStrArrayStrArrayStr 调用列表对应的参数列表
     * @param interfaceClazz           如果希望调用的类是接口，则此处为接口名。如果是普通类，则与implClazz保持一致
     * @param methodParamTypeMap       调用列表中各种方法对应的参数类型，需要在该Map中注册
     * @return 调用结果
     */
    public static Object[] listInvoke(Class<?> implClazz, String invokeStrArrayStr, String paramStrArrayStrArrayStr, Class<?> interfaceClazz, Map<String, Class<?>[]> methodParamTypeMap) {
        Object target = null;
        String[] invokeStrArray = CommonStr.parse2StringArray(invokeStrArrayStr.replace("\"", ""));
        /* 将该2D的ArrayString转为1D的Array，里面存的是string形式的Array*/
        String[] paramStrArrayStrArray = CommonStr.parseTwoDArrayString2OneDStringArray(paramStrArrayStrArrayStr);

        if (invokeStrArray.length != paramStrArrayStrArray.length)
            throw new RuntimeException("invoke操作数量 和 param数组数量 不相等");
        Object[] result = new Object[invokeStrArray.length];

        try {
            for (int invokeStr_i = 0; invokeStr_i < invokeStrArray.length; invokeStr_i++) {
                String invokeStr = invokeStrArray[invokeStr_i];
                if (!methodParamTypeMap.containsKey(invokeStr))
                    throw new RuntimeException("methodParamTypeMap里未注册该方法:" + invokeStr + "。 也可能是未正确设置接口类 当前接口类为" + interfaceClazz.getName());
                Class<?>[] paramClazzArray = methodParamTypeMap.get(invokeStr);
                if (paramClazzArray == null) throw new RuntimeException("无参是[]而非null,注意构造方法也需要注册");
                Object[] param = parseParam(paramStrArrayStrArray[invokeStr_i], paramClazzArray);

                if (interfaceClazz.getSimpleName().equals(invokeStr)) {
                    Constructor<?> declaredConstructor = implClazz.getDeclaredConstructor(paramClazzArray);
                    declaredConstructor.setAccessible(true);
                    target = declaredConstructor.newInstance(param);
                } else {
                    if (target == null) throw new RuntimeException("invokeArray有问题，还未初始化就开始调用");
                    Method method = implClazz.getDeclaredMethod(invokeStr, paramClazzArray);
                    method.setAccessible(true);
                    result[invokeStr_i] = method.invoke(target, param);
                }
            }
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static Object[] parseParam(String paramStrArrayStr, Class<?>[] paramClazzArray) {
        String[] paramStrArray = CommonStr.parse2StringArray(paramStrArrayStr);
        if (paramStrArray.length != paramClazzArray.length)
            throw new RuntimeException("param数组" + paramStrArrayStr + "内的param数量 与 Map注册的" + Arrays.toString(paramClazzArray) + "参数数量 不相等");
        Object[] param = new Object[paramClazzArray.length];

        for (int param_i = 0; param_i < paramClazzArray.length; param_i++) {
            Class<?> paramClazz = paramClazzArray[param_i];

            if (Integer.class.equals(paramClazz) || int.class.equals(paramClazz))
                param[param_i] = Integer.parseInt(paramStrArray[param_i]);
            else if (Boolean.class.equals(paramClazz) || boolean.class.equals(paramClazz))
                param[param_i] = Boolean.parseBoolean(paramStrArray[param_i]);
            else if (String.class.equals(paramClazz))
                param[param_i] = paramStrArray[param_i];
            else if (Float.class.equals(paramClazz) || float.class.equals(paramClazz))
                param[param_i] = Float.parseFloat(paramStrArray[param_i]);
            else if (Double.class.equals(paramClazz) || double.class.equals(paramClazz))
                param[param_i] = Double.parseDouble(paramStrArray[param_i]);
            else throw new RuntimeException("目前不支持该类型的参数:" + paramClazz.getName());
        }
        return param;
    }
}
