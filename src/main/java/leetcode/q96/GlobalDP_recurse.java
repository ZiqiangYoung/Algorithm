package leetcode.q96;

import java.util.HashMap;
import java.util.Map;

/**
 * <strong>子状态恒定，跌跌撞撞做成了四不像的全局DP，甚至还用了递归</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 * @deprecated 没直接找到最优解，核心是一致的，但是没归纳成最精简的形式。
 **/
@Deprecated
@SuppressWarnings("DeprecatedIsStillUsed")
class GlobalDP_recurse implements Solution {
    private static final Map<Integer, Integer> ans;

    static {
        ans = new HashMap<>();
        ans.put(0, 1);
        ans.put(1, 1);
        ans.put(2, 2);
        ans.put(3, 5);
    }

    @Override
    public int numTrees(int n) {
        if (ans.containsKey(n)) return ans.get(n);

        int mid = (n - 1) / 2, sum = 0;
        for (int left = 0; left <= mid; left++) {
            int right = n - 1 - left;
            if (!ans.containsKey(right)) ans.put(right, numTrees(right));
            sum += 2 * (ans.get(left) * ans.get(right));
        }
        if (n % 2 == 1) sum -= ans.get(n / 2) * ans.get(n / 2);
        ans.put(n, sum);
        return sum;
    }
}
