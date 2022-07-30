package leetcode.q593;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/29</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Mathematics implements Solution {
    @Override
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> set = new HashSet<>();
        set.add(distance(p1, p2));
        set.add(distance(p1, p3));
        set.add(distance(p1, p4));
        set.add(distance(p2, p3));
        set.add(distance(p2, p4));
        set.add(distance(p3, p4));
        return set.size() == 2 && !set.contains(0);
    }

    private Integer distance(int[] a, int[] b) {
        int i = a[0] - b[0], j = a[1] - b[1];
        return i * i + j * j;
    }
}
