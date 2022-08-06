package leetcode.q1184;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/24</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Traverse implements Solution {
    @Override
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0, dis = 0;
        if (start > destination) {
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
            if (i >= start && i < destination) dis += distance[i];
        }
        return Math.min(dis, sum - dis);
    }
}
