package exam.meituan.D0820;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] p1 = new int[2], p2 = new int[2], p3 = new int[2], dis = new int[3];
        p1[0] = scanner.nextInt();
        p1[1] = scanner.nextInt();
        p2[0] = scanner.nextInt();
        p2[1] = scanner.nextInt();
        p3[0] = scanner.nextInt();
        p3[1] = scanner.nextInt();
        dis[0] = scanner.nextInt();
        dis[1] = scanner.nextInt();
        dis[2] = scanner.nextInt();

        position(n, p1, p2, p3, dis);
    }

    private static void position(int n, int[] p1, int[] p2, int[] p3, int[] dis) {
        int xMin = Math.max(0, p1[0] - dis[0]), xMax = Math.min(50000, p1[0] + dis[0]);
        xMin = Math.max(xMin, Math.max(Math.max(0, p2[0] - dis[1]), Math.max(0, p3[0] - dis[2])));
        xMax = Math.min(xMax, Math.min(Math.min(50000, p2[0] + dis[1]), Math.min(50000, p3[0] + dis[2])));
        for (int i = xMin; i <= xMax; i++) {
            int offsetY1 = dis[0] - Math.abs(i - p1[0]);
            int offsetY2 = dis[1] - Math.abs(i - p2[0]);
            int offsetY3 = dis[2] - Math.abs(i - p3[0]);
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> set3 = new HashSet<>();

            int yTmp = p1[1] - offsetY1;
            if (yTmp >= 0) set1.add(yTmp);
            yTmp = p2[1] - offsetY2;
            if (yTmp >= 0) set2.add(yTmp);
            yTmp = p3[1] - offsetY3;
            if (yTmp >= 0) set3.add(yTmp);

            yTmp = p1[1] + offsetY1;
            if (yTmp <= 50000) set1.add(yTmp);
            yTmp = p2[1] + offsetY2;
            if (yTmp <= 50000) set2.add(yTmp);
            yTmp = p3[1] + offsetY3;
            if (yTmp <= 50000) set3.add(yTmp);


            for (Integer integer : set1) {
                if (set2.contains(integer)) {
                    if (set3.contains(integer)) {
                        System.out.println(i + " " + integer);
                        return;
                    }
                }
            }
        }
    }
}
