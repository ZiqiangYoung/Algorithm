package leetcode.q509;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/8</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int fib(int n) {
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return n > 0 ? b : 0;
    }
}
