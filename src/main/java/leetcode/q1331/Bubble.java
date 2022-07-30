package leetcode.q1331;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/28</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class Bubble implements Solution {
    @Override
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        for (int i : sortedArr) map.putIfAbsent(i, map.size() + 1);
        for (int i = 0; i < arr.length; i++) arr[i] = map.get(arr[i]);
        return arr;
    }
}
