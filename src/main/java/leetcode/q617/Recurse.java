package leetcode.q617;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Recurse implements Solution {
    @Override
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2 == null ? null : new TreeNode(root2.val);
        else if (root2 == null) return new TreeNode(root1.val);
        return new TreeNode(root1.val + root2.val,
                mergeTrees(root1.left, root2.left),
                mergeTrees(root1.right, root2.right));
    }
}