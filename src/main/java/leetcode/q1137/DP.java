package leetcode.q1137;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/9</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    @SuppressWarnings("SpellCheckingInspection")
    public int tribonacci(int n) {
        if (n < 2) return n;
        if (n == 2) return 1;
        int a, b = 0, c = 1, d = 1;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        return d;
    }
}
