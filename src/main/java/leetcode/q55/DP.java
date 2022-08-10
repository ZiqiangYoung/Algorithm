package leetcode.q55;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public boolean canJump(int[] nums) {
        int length = nums.length;
        boolean[] dp = new boolean[length];
        dp[0] = true;
        for (int i = 0; i < length; i++)
            if (dp[i]) for (int j = 1; j <= nums[i]; j++)
                if (i + j + 1 >= length) return true;
                else dp[i + j] = true;
        return dp[length - 1];
    }
}
