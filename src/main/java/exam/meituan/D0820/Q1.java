package exam.meituan.D0820;

import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String lineA = scanner.nextLine();
        String lineB = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print(lineA.charAt(i));
            System.out.print(lineB.charAt(i));
        }

    }
}
