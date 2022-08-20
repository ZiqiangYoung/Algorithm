package exam.meituan.D0813;

import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] split = scanner.nextLine().strip().split(" ");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        int[] foo = foo(n, ints);
        for (int i = 0; i < foo.length - 1; i++) {
            System.out.println(foo[i] + " ");
        }
        System.out.println(foo[foo.length - 1]);
    }

    private static int[] foo(int n, int[] nums) {
        int length = nums.length, flag = 0;
        int[] ans = new int[length];
        for (int i = 0, pre = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int index = (j + pre) % length;
                if (ans[index] == 0) {
                    flag++;
                    if (flag > 2) {
                        --n;
                        ans[index] = nums[i];
                        if (n == 2 || n == 1) {
                            flag = 2;
                            pre = index;
                        } else {
                            flag = 0;
                            pre = index + 1;
                        }
                        if (n == 0) return ans;
                    }
                }
            }
        }
        return ans;
    }
}
