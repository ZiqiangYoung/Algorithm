package leetcode.q952;

import java.util.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/30</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 * @deprecated 该邻接矩阵的解法在规模较大时会被Leetcode判定OOM
 **/
@SuppressWarnings("DeprecatedIsStillUsed")
class AdjacencyMatrixBFS implements Solution {
    int          length;
    int[][]      adjacencyMatrix;
    Set<Integer> unVisitedVertexSet;

    @Override
    public int largestComponentSize(int[] nums) {
        length = nums.length;
        adjacencyMatrix = new int[length][length];
        unVisitedVertexSet = new HashSet<>(length);

        for (int i = 0; i < length; i++)
            for (int j = i + 1; j < length; j++)
                if (adjacencyMatrix[j][i] == 0 && 1 != gcd(nums[i], nums[j])) {
                    unVisitedVertexSet.add(i);
                    unVisitedVertexSet.add(j);
                    adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = 1;
                }

        int sz, max = 1;
        while ((sz = unVisitedVertexSet.size()) > 0) {
            bfs(unVisitedVertexSet.iterator().next());
            max = Math.max(sz - unVisitedVertexSet.size(), max);
        }
        return max;
    }

    private void bfs(int i) {
        if (!unVisitedVertexSet.contains(i)) return;
        unVisitedVertexSet.remove(i);
        for (int j = 0; j < length; j++) {
            if (adjacencyMatrix[i][j] == 1) {
                adjacencyMatrix[i][j] = adjacencyMatrix[j][i] = -1;
                bfs(j);
            }
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
