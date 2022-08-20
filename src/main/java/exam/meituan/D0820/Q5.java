package exam.meituan.D0820;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = Integer.parseInt(scanner.nextLine().strip());
        String[] split = scanner.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(split[i]);
        }

        split = scanner.nextLine().split(" ");
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(split[i]);
        }
/*3 3
4 1 3
4 2 1*/

        int ans = 0;
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            int tmp = ans;
            for (int j = 0; j < m; j++) {
                if (b[j] >= a[i]) {
                    ans += b[j];
                    break;
                }
            }
            if (tmp == ans) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}
