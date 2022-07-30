package leetcode.q2305;

import java.util.Arrays;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class PruningBacktrace implements Solution {
    private int[] cookies;
    private int   answer;

    @Override
    public int distributeCookies(int[] cookies, int k) {
        Arrays.sort(cookies);
        this.cookies = cookies;
        answer = Integer.MAX_VALUE;

        backtrace(new int[k], 0);
        return answer;
    }

    private void backtrace(int[] bucket, int start) {
        if (start > cookies.length - 1) {
            int tmp = 0;
            for (int count : bucket) {
                tmp = Math.max(tmp, count);
            }
            answer = Math.min(answer, tmp);
            return;
        }

        if (start == 0) {
            bucket[0] = cookies[0];
            backtrace(bucket, 1);
            return;
        }

        for (int i = 0; i < bucket.length; i++) {
            int tmp = bucket[i] + cookies[start];
            if (tmp < answer) {
                bucket[i] = tmp;
                backtrace(bucket, start + 1);
                bucket[i] -= cookies[start];
            }
        }
    }
}
