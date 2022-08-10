package leetcode.q45;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int jump(int[] nums) {
        int length = nums.length;
        if (length < 2) return 0;
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                int index = i + j;
                if (index >= length) index = length - 1;
                if (dp[index] == 0) dp[index] = dp[i] + 1;
                else dp[index] = Math.min(dp[i] + 1, dp[index]);
            }
        }
        return dp[length - 1];
    }
}
