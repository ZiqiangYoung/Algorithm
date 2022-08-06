package leetcode.q1408;

import java.util.ArrayList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Violate implements Solution {
    @Override
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            for (int j = 0; j < words.length; j++)
                if (words[j].contains(words[i]) && i != j) {
                    list.add(words[i]);
                    break;
                }
        return list;
    }
}
