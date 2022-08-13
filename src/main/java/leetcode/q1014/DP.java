package leetcode.q1014;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public int maxScoreSightseeingPair(int[] values) {
        int length = values.length, ans = 0, preMax = values[0];
        for (int i = 1; i < length; i++) {
            ans = Math.max(ans, preMax + values[i] - i);
            preMax = Math.max(preMax, values[i] + i);
        }
        return ans;
    }
}
