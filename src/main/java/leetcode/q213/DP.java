package leetcode.q213;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        if (length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, length - 1), rob(nums, 1, length));
    }

    private int rob(int[] nums, int start, int end) {
        int pre_pre, pre = nums[start], current = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++) {
            pre_pre = pre;
            pre = current;
            current = Math.max(pre_pre + nums[i], pre);
        }
        return current;
    }
}
