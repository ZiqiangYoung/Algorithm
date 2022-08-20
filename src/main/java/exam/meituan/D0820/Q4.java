package exam.meituan.D0820;

import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = Integer.parseInt(scanner.nextLine());
        String[] split = scanner.nextLine().split(" ");
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = Integer.parseInt(split[n]);
        }
        split = scanner.nextLine().split(" ");
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = Integer.parseInt(split[n]);
        }

        System.out.println(foo(n, m, array1, array2));
    }

    private static int foo(int n, int m, int[] array1, int[] array2) {
        /*TODO:DP,没做出来*/
        return -1;
    }
}
