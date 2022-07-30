package leetcode.q592;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/27</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class Simulation implements Solution {
    @Override
    public String fractionAddition(String expression) {
        long numerator = 0, denominator = 1, gcd;
        String[] split = expression.substring(0, 1).concat(expression.substring(1).replace("+", "!+").replace("-", "!-")).split("!");
        for (String s : split) {
            long newDenominator = Long.parseLong(s.substring(s.indexOf("/") + 1));
            numerator = numerator * newDenominator + Long.parseLong(s.substring(0, s.indexOf("/"))) * denominator;
            denominator *= newDenominator;
        }
        gcd = gcd(numerator, denominator);
        if (Math.signum(gcd) * Math.signum(denominator) < 0) gcd = -gcd;
        return numerator / gcd + "/" + denominator / gcd;
    }

    public long gcd(long a, long b) {
        long tmp = a % b;
        while (tmp != 0) {
            a = b;
            b = tmp;
            tmp = a % b;
        }
        return b;
    }
}
