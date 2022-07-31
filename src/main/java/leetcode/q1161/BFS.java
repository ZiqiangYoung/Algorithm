package leetcode.q1161;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/31</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class BFS implements Solution {
    @Override
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        int size, index = 0, ans = 0, sum, maxSum = Integer.MIN_VALUE;
        while ((size = level.size()) > 0) {
            for (sum = 0, index++; size > 0; size--) {
                TreeNode poll = level.poll();
                //noinspection ConstantConditions
                sum += poll.val;
                if (poll.left != null) level.offer(poll.left);
                if (poll.right != null) level.offer(poll.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                ans = index;
            }
        }
        return ans;
    }
}
