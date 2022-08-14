package leetcode.q6149;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/14</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Traverse implements Solution {
    @Override
    public int edgeScore(int[] edges) {
        int length = edges.length, ans = 0;
        long[] sums = new long[length];
        long max = 0;
        for (int i = 0; i < edges.length; i++) {
            int p = edges[i];
            sums[p] += i;
            if (sums[p] > max) {
                max = sums[p];
                ans = p;
            } else if (sums[p] == max)
                ans = Math.min(ans, p);
        }
        return ans;
    }
}
