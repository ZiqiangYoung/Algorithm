package exam.meituan.D0813;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = Integer.parseInt(scanner.nextLine().strip());
        String[] split = scanner.nextLine().split(" ");
        int[] orders = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            orders[i] = Integer.parseInt(split[i]);
        }
        System.out.println(foo(n, t, orders));
    }

    public static int foo(int n, int t, int[] ends) {
        Arrays.sort(ends);
        int start = 0, count = 0;
        for (int end : ends) {
            if (end >= start + t) {
                start += t;
                count++;
            }
        }
        return n - count;
    }
}
