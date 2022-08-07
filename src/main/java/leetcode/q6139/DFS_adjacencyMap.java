package leetcode.q6139;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <strong>leetcode 周赛306 临场TLE</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 * @deprecated 邻接表方案为Map&lt;int, Set&lt;int&gt;&gt; 虽然已优化至AC 但表现非常差
 **/
@Deprecated
class DFS_adjacencyMap implements Solution {
    Map<Integer, Set<Integer>> map;
    int                        ans;
    boolean[]                  visited;

    @Override
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        map = new HashMap<>(n);
        for (int i = 0; i < n; i++) map.put(i, new HashSet<>());
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        visited = new boolean[n];
        for (int i : restricted) visited[i] = true;
        dfs(ans = 0);
        return ans;
    }

    private void dfs(int start) {
        if (visited[start]) return;
        visited[start] = true;
        ans++;
        for (Integer integer : map.get(start)) {
            dfs(integer);
        }
    }
}
