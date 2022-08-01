package leetcode.q1374;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/1</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class Greedy implements Solution {
    @Override
    public String generateTheString(int n) {
        return "a".repeat(n - 1).concat(n % 2 == 0 ? "b" : "a");
    }
}
