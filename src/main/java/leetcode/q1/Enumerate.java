package leetcode.q1;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/16</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Enumerate implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (leftover == nums[j]) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
