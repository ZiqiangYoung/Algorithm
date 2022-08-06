package leetcode.q623;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class DFS implements Solution {
    @Override
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) return null;
        if (depth == 1) return new TreeNode(val, root, null);
        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            root.left = addOneRow(root.left, val, depth - 1);
            root.right = addOneRow(root.right, val, depth - 1);
        }
        return root;
    }
}
