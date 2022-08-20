package exam.meituan.D0813;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = Integer.parseInt(scanner.nextLine().strip());
        byte[] bytes = scanner.nextLine().getBytes(StandardCharsets.US_ASCII);
        System.out.println(clean(n, m, k, bytes));
    }

    private static int clean(int n, int m, int k, byte[] commands) {
        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;
        int x = 0, y = 0, ans = n * m - 1;
        for (int i = 0; i < k; i++) {
            switch (commands[i]) {
                case 'W':
                    if (y > 0) --y;
                    break;
                case 'A':
                    if (x > 0) --x;
                    break;
                case 'S':
                    if (y < m - 1) ++y;
                    break;
                case 'D':
                    if (x < n - 1) ++x;
            }
            if (!vis[x][y]) {
                vis[x][y] = true;
                if (--ans == 0) {
                    System.out.println("Yes");
                    return i + 1;
                }
            }
        }
        System.out.println("No");
        return ans;
    }
}
