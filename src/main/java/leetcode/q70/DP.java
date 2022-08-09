package leetcode.q70;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int climbStairs(int n) {
        if (n < 4) return n;
        int a, b = 2, c = 3;
        for (int i = 4; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
