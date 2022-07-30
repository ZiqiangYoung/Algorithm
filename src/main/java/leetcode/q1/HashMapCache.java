package leetcode.q1;

import java.util.HashMap;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/16</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class HashMapCache implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i]))
                return new int[]{hashMap.get(target - nums[i]), i};
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
