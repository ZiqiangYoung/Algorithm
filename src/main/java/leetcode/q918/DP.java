package leetcode.q918;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/11</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int maxSubarraySumCircular(int[] nums) {
        int preMax = 0, preMin = 0, max = nums[0], min = nums[0], sum = 0;
        for (int num : nums) {
            sum += num;
            preMax = Math.max(num, num + preMax);
            max = Math.max(max, preMax);

            preMin = Math.min(num, num + preMin);
            min = Math.min(min, preMin);
        }
        return max > 0 ? Math.max(max, sum - min) : max;
    }
}
