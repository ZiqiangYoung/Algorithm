package leetcode.q746;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/9</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int minCostClimbingStairs(int[] cost) {
        int a, b = 0, c = 0;
        for (int i = 2; i <= cost.length; i++) {
            a = b;
            b = c;
            c = Math.min(a + cost[i - 2], b + cost[i - 1]);
        }
        return c;
    }
}
