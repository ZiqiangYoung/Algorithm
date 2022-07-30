package leetcode.q98;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Recurse implements Solution {
    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE);
    }

    public boolean isValidBST(TreeNode root, long pre) {
        if (root == null) return true;
        boolean leftValid = isValidBST(root.left, pre);
        if (pre >= root.val) return false;
        pre = root.val;
        return leftValid && isValidBST(root.right, pre);
    }
}
