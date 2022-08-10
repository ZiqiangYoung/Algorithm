package leetcode.q45;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Greedy implements Solution {
    @Override
    public int jump(int[] nums) {
        int cur = nums[0], lastIndex = nums.length - 1, ans = 0;
        if (lastIndex < 1) return 0;
        for (int pre = 0, p = cur, next = cur; p < lastIndex; p--) {
            if (p < pre) {
                ++ans;
                pre = cur;
                p = cur = next;
            }
            if ((next = Math.max(next, p + nums[p])) >= lastIndex) return ans + 2;
        }
        return ans + 1;
    }
}
