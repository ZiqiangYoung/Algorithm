package leetcode.q98;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class InterruptRecurse implements Solution {
    private long pre;

    @Override
    public boolean isValidBST(TreeNode root) {
        try {
            pre = Long.MIN_VALUE;
            travel(root);
        } catch (InterruptedException e) {
            return false;
        }
        return true;
    }

    private void travel(TreeNode node) throws InterruptedException {
        if (node == null) return;
        travel(node.left);
        if (pre >= node.val) throw new InterruptedException();
        else pre = node.val;
        travel(node.right);
    }
}
