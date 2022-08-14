package leetcode.q6150;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/14</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Greedy implements Solution {
    @Override
    public String smallestNumber(String pattern) {
        byte[] bytes = pattern.getBytes();
        int length = bytes.length, count = 0;
        byte[] ans = new byte[length + 1];

        byte p = '0';
        for (int i = 0; i < length; i++) {
            if (bytes[i] == 'D') count++;
            else if (count > 0) {
                for (int j = 0; j <= count; j++)
                    ans[i - j] = ++p;
                count = 0;
            } else ans[i] = ++p;
        }

        if (count > 0) {
            for (int j = 0; j <= count; j++)
                ans[length - j] = ++p;
        } else ans[length] = ++p;
        return new String(ans);
    }
}
