package leetcode.q55;

import lombok.extern.slf4j.Slf4j;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Greedy implements Solution {
    @Override
    public boolean canJump(int[] nums) {
        int rightmost = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, nums[i] + i);
                if (rightmost >= length - 1) return true;
            }
        }
        return false;
    }
}
