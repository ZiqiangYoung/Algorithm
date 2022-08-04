package leetcode.q1403;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/4</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class Greedy implements Solution {
    @Override
    public List<Integer> minSubsequence(int[] nums) {
        int current = 0, sum = 0;
        Arrays.sort(nums);
        for (int num : nums) sum += num;
        List<Integer> ans = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            current += nums[i];
            ans.add(nums[i]);
            if (current > sum - current) break;
        }
        return ans;
    }
}
