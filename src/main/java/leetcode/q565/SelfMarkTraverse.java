package leetcode.q565;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SelfMarkTraverse implements Solution {
    @Override
    public int arrayNesting(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = i;
            while (nums[num] >= 0) {
                int tmp = num;
                num = nums[num];
                nums[tmp] = -1;
                count++;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}
