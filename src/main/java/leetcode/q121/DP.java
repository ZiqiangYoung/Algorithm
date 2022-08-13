package leetcode.q121;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int maxProfit(int[] prices) {
        int ans = 0, preMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            ans = Math.max(ans, prices[i] - preMin);
            preMin = Math.min(preMin, prices[i]);
        }
        return ans;
    }
}