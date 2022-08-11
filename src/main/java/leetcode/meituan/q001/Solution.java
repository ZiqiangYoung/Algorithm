package leetcode.meituan.q001;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sum; i++) {
            System.out.println(validateUserName(scanner.nextLine()) ? "Accept" : "Wrong");
        }
    }

    public static boolean validateUserName(String userName) {
        if (userName == null || "".equals(userName)) return false;
        boolean number = false;
        byte[] bytes = userName.getBytes(StandardCharsets.UTF_8);
        if (notAlphabet(bytes[0])) return false;
        for (byte aByte : bytes)
            if ('0' <= aByte && aByte <= '9') number = true;
            else if (notAlphabet(aByte)) return false;
        return number;
    }

    private static boolean notAlphabet(byte aByte) {
        return aByte < 'A' || aByte > 'z' || ('Z' < aByte && aByte < 'a');
    }
}
