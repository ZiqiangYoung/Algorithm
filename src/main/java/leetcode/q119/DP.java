package leetcode.q119;

import java.util.ArrayList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DP implements Solution {
    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>(rowIndex + 1);
        ans.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            ans.add(0);
            for (int j = i; j > 0; j--)
                ans.set(j, ans.get(j - 1) + ans.get(j));
        }
        return ans;
    }
}
