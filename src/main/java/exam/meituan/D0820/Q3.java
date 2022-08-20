package exam.meituan.D0820;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/20</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = Integer.parseInt(scanner.nextLine().strip());
        String[] split = scanner.nextLine().split(" ");
        int[] poss = new int[n];
        for (int i = 0; i < n; i++) {
            poss[i] = Integer.parseInt(split[i]);
        }
        split = scanner.nextLine().split(" ");
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(split[i]);
        }

        System.out.printf("%.2f", solution(n, m, poss, score));
    }

    @SuppressWarnings("ConstantConditions")
    private static double solution(int n, int m, int[] poss, int[] score) {
        Queue<Double> queue = new PriorityQueue<>();
        int size = 0;
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans += 1.0 * poss[i] * score[i] / 100;
            double profit = 1.0 * (100 - poss[i]) * score[i] / 100;
            if (size < m) {
                if (profit > 0) {
                    queue.offer(profit);
                    ans += profit;
                    size++;
                }
            } else {
                if (queue.peek() < profit) {
                    ans -= queue.poll();
                    queue.offer(profit);
                    ans += profit;
                }
            }
        }
        return ans;
    }

}
