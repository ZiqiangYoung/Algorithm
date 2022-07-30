package leetcode.q207;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/24</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class Topology implements Solution {
    @Override
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edges = new ArrayList<>(numCourses);
        int[] inDegrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            edges.add(new ArrayList<>());
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[0]).add(prerequisite[1]);
            ++inDegrees[prerequisite[1]];
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < inDegrees.length; i++)
            if (inDegrees[i] == 0) queue.offer(i);
        int visited = 0;
        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            for (Integer edge : edges.get(vertex))
                if (--inDegrees[edge] == 0)
                    queue.offer(edge);
            visited++;
        }
        return visited == numCourses;
    }
}
