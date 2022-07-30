package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class CommonStr {
    public static int[] parse2IntArray(String arrayStr) {
        arrayStr = formatArrayStr(arrayStr);
        if ("".equals(arrayStr) || "null".equals(arrayStr)) return new int[0];
        String[] split = arrayStr.split(",");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            if ("null".equals(split[i])) throw new RuntimeException("int数组中不允许存在null");
            array[i] = Integer.parseInt(split[i]);
        }
        return array;
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
        Integer[] integers = parse2IntegerArray(listStr);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, integers);
        return list;
    }

    public static String[] parse2StringArray(String arrayStr) {
        arrayStr = formatArrayStr(arrayStr);
        if ("".equals(arrayStr) || "null".equals(arrayStr)) return new String[0];
        return arrayStr.split(",");
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
