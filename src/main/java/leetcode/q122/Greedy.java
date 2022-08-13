package leetcode.q122;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Greedy implements Solution {
    @Override
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++)
            ans = Math.max(ans, ans + prices[i] - prices[i - 1]);
        return ans;
    }
}
