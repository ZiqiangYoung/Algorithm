package leetcode.q198;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/9</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int pre_pre, pre = nums[0], cur = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            pre_pre = pre;
            pre = cur;
            cur = Math.max(pre_pre + nums[i], pre);
        }
        return cur;
    }
}
