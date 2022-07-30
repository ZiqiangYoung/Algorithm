package leetcode.q110;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class InterruptRecurse implements Solution {
    @Override
    public boolean isBalanced(TreeNode root) {
        try {
            check(root);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }

    public int check(TreeNode root) throws InterruptedException {
        if (root == null) return 0;
        int depLeft = check(root.left);
        int depRight = check(root.right);
        if (Math.abs(depLeft - depRight) > 1) throw new InterruptedException();
        return Math.max(depLeft, depRight) + 1;
    }
}