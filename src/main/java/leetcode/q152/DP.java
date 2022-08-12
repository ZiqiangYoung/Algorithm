package leetcode.q152;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/12</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int maxProduct(int[] nums) {
        int preMax = nums[0], preMin = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i], preMaxTmp = preMax;
            preMax = Math.max(num, Math.max(preMaxTmp * num, preMin * num));
            preMin = Math.min(num, Math.min(preMaxTmp * num, preMin * num));
            max = Math.max(max, preMax);
        }
        return max;
    }
}
