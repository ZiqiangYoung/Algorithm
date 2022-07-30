package leetcode.q99;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Recurse implements Solution {
    private TreeNode pre, x, y;

    @Override
    public void recoverTree(TreeNode root) {
        pre = x = y = null;
        travel(root);
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }

    private void travel(TreeNode node) {
        if (node == null) return;
        travel(node.left);
        if (pre != null && pre.val >= node.val) {
            if (x == null) x = pre;
            y = node;
        }
        pre = node;
        travel(node.right);
    }
}