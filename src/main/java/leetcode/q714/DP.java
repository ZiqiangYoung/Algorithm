package leetcode.q714;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/16</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int maxProfit(int[] prices, int fee) {
        int length = prices.length, have = -prices[0] - fee, notHave = 0;
        for (int i = 1; i < length; i++) {
            int have_tmp = have;
            have = Math.max(have, notHave - prices[i] - fee);
            notHave = Math.max(notHave, have_tmp + prices[i]);
        }
        return notHave;
    }
}