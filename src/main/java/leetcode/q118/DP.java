package leetcode.q118;

import java.util.ArrayList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class DP implements Solution {
    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>(numRows);
        ans.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            ans.add(new ArrayList<>(i));
            ans.get(i).add(1);
            for (int j = 1; j < i; j++)
                ans.get(i).add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            ans.get(i).add(1);
        }
        return ans;
    }
}
