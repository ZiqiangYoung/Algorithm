package leetcode.q740;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int deleteAndEarn(int[] nums) {
        if (nums.length < 2) return nums[0];

        int max = 0;
        for (int num : nums) max = Math.max(max, num);
        int[] dp = new int[max + 1];
        for (int num : nums) dp[num] += num;

        int pre_pre, pre = dp[0], cur = Math.max(dp[0], dp[1]);
        for (int i = 2; i <= max; i++) {
            pre_pre = pre;
            pre = cur;
            cur = Math.max(pre, pre_pre + dp[i]);
        }
        return cur;
    }
}
