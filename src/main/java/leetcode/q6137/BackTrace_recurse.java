package leetcode.q6137;


/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class BackTrace_recurse implements Solution {
    @Override
    public boolean validPartition(int[] nums) {
        return validPartition(nums, nums.length, 2) || validPartition(nums, nums.length, 3);
    }

    private boolean validPartition(int[] nums, int end, int step) {
        if (end - step < 0) return false;
        if (end - step == 0)
            if (step == 2)
                return nums[end - 2] == nums[end - 1];
            else
                return (
                        nums[end - 3] == nums[end - 2] && nums[end - 2] == nums[end - 1]
                ) || (
                        1 + nums[end - 3] == nums[end - 2] && 1 + nums[end - 2] == nums[end - 1]
                );

        if (step == 2)
            return nums[end - 2] == nums[end - 1]
                    && (
                    validPartition(nums, end - 2, 2) || validPartition(nums, end - 2, 3)
            );
        else
            return (
                    (
                            1 + nums[end - 3] == nums[end - 2] && 1 + nums[end - 2] == nums[end - 1]
                    ) || (
                            nums[end - 3] == nums[end - 2] && nums[end - 2] == nums[end - 1]
                    )
            ) && (
                    validPartition(nums, end - 3, 2) || validPartition(nums, end - 3, 3)
            );
    }
}
