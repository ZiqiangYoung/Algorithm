package leetcode.q6148;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/14</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class BruteForce implements Solution {
    @Override
    public int[][] largestLocal(int[][] grid) {
        int x = grid.length - 2, y = grid[0].length - 2;
        int[][] ans = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int max = 0;
                for (int k = 0; k < 3; k++)
                    for (int l = 0; l < 3; l++)
                        max = Math.max(max, grid[i + k][j + l]);
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
