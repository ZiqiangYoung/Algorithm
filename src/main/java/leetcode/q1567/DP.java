package leetcode.q1567;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/12</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int getMaxLen(int[] nums) {
        int length = nums.length, ans = nums[0] > 0 ? 1 : 0, positive, negative;
        positive = nums[0] > 0 ? 1 : 0;
        negative = nums[0] < 0 ? 1 : 0;
        for (int i = 1, tmp; i < length; i++) {
            if (nums[i] > 0) {
                positive = positive + 1;
                negative = negative > 0 ? negative + 1 : 0;
            } else if (nums[i] < 0) {
                tmp = positive;
                positive = negative > 0 ? negative + 1 : 0;
                negative = tmp + 1;
            } else positive = negative = 0;
            ans = Math.max(ans, positive);
        }
        return ans;
    }
}
