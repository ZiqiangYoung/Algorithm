package leetcode.q110;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Recurse implements Solution {
    @Override
    public boolean isBalanced(TreeNode root) {
        return balancedDepth(root) >= 0;
    }

    public int balancedDepth(TreeNode root) {
        int depLeft, depRight;
        if (root == null) return 0;
        if ((depLeft = balancedDepth(root.left)) < 0) return -1;
        if ((depRight = balancedDepth(root.right)) < 0 || Math.abs(depLeft - depRight) > 1) return -1;
        return Math.max(depLeft, depRight) + 1;
    }
}