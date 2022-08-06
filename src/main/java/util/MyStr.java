package util;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class MyStr {
    public static int[] parse2IntArray(String arrayStr) {
        try {
            return Arrays.stream(parse2IntegerArray(arrayStr)).mapToInt(Integer::intValue).toArray();
        } catch (NullPointerException e) {
            throw new RuntimeException("字符串中含有 NULL,无法解析为 Int. ", e);
        }
    }

    public static Integer[] parse2IntegerArray(String arrayStr) {
        arrayStr = formatArrayStr(arrayStr);
        if ("".equals(arrayStr) || "null".equals(arrayStr)) return new Integer[0];
        String[] split = arrayStr.split(",");
        Integer[] array = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            if ("null".equals(split[i])) array[i] = null;
            else array[i] = Integer.parseInt(split[i]);
        }
        return array;
    }

    public static List<Integer> parse2IntegerList(String listStr) {
        return MyCollections.toArrayList(parse2IntegerArray(listStr));
    }

    public static String[] parse2StringArray(String arrayStr) {
        arrayStr = formatArrayStr(arrayStr);
        if ("".equals(arrayStr) || "null".equals(arrayStr)) return new String[0];
        String[] strings = arrayStr.split(",");
        /* 对于需要将该字符串数组转换为别的类型的使用者，每一项应当不会被双引号包裹，就不会被以下循环修改 */
        for (int i = 0; i < strings.length; i++)
            if (strings[i].startsWith("\"") && strings[i].endsWith("\""))
                strings[i] = strings[i].substring(1, strings[i].length() - 1);
        return strings;
    }

    public static List<String> parse2StringList(String arrayStr) {
        return MyCollections.toArrayList(parse2StringArray(arrayStr));
    }

    public static String[] parseTwoDArrayString2OneDStringArray(String arrayStr) {
        arrayStr = formatArrayStr(arrayStr);
        if ("".equals(arrayStr) || "null".equals(arrayStr)) throw new RuntimeException("二维数组的子数组不能为空或null");
        return arrayStr
                .replace("],", "]甦￥軐")
                .split("甦￥軐");
    }

    public static int[][] parseTwoDArrayString2TwoDIntArray(String arrayStr) {
        String[] stringArray = parseTwoDArrayString2OneDStringArray(arrayStr);
        List<int[]> list = new LinkedList<>();
        int max = 0;
        for (String s : stringArray) {
            int[] intArray = parse2IntArray(s);
            list.add(intArray);
            if (intArray.length > max) max = intArray.length;
        }
        return list.toArray(new int[0][]);
    }

    private static String formatArrayStr(String arrayStr) {
        arrayStr = arrayStr.replace(" ", "");
        if (!arrayStr.endsWith("]") || !arrayStr.startsWith("["))
            throw new RuntimeException("输入的字符串没被[]包裹，不是数组");
        return arrayStr.substring(1, arrayStr.length() - 1);
    }
}
