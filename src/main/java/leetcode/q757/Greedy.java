package leetcode.q757;

import java.util.Arrays;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/23</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Greedy implements Solution {
    @Override
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
        int pre2 = intervals[0][1], pre1 = pre2 - 1, ans = 2;
        for (int i = 1; i < intervals.length; i++) {
            if (pre2 < intervals[i][0]) {
                ans += 2;
                pre2 = intervals[i][1];
                pre1 = pre2 - 1;
            } else if (pre1 < intervals[i][0]) {
                ans++;
                if (pre2 != intervals[i][1]) {
                    pre1 = pre2;
                    pre2 = intervals[i][1];
                } else pre1 = pre2 - 1;
            }
        }
        return ans;
    }
}
