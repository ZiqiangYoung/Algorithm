package leetcode.q6139;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
@SuppressWarnings("DuplicatedCode")
public class BFS_adjacencyList implements Solution {
    @Override
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[] vis = new boolean[n];
        //noinspection unchecked
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < adj.length; i++) adj[i] = new LinkedList<>();

        for (int i : restricted) vis[i] = true;
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        int sz, ans = 1;

        while ((sz = queue.size()) > 0)
            while (sz-- > 0)
                //noinspection ConstantConditions
                for (Integer next : adj[queue.poll()]) {
                    if (!vis[next]) {
                        vis[next] = true;
                        queue.offer(next);
                        ans++;
                    }
                }
        return ans;
    }
}
