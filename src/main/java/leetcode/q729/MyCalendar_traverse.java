package leetcode.q729;

import java.util.ArrayList;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class MyCalendar_traverse extends MyCalendar {
    ArrayList<Integer> leftList, rightList;

    public MyCalendar_traverse() {
        leftList = new ArrayList<>();
        rightList = new ArrayList<>();
    }

    @Override
    public boolean book(int start, int end) {
        for (int i = 0; i < leftList.size(); i++)
            if (end > leftList.get(i) && start < rightList.get(i)) return false;
        return leftList.add(start) && rightList.add(end);
    }
}
