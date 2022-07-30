package leetcode.q104;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/19</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class RecurseCount implements Solution {
    public int count, max;

    @Override
    public int maxDepth(TreeNode root) {
        max = count = 0;
        if (root != null) {
            travel(root);
            return max;
        } else return 0;
    }

    private void travel(TreeNode root) {
        if (++count > max) max = count;
        if (root.left != null) travel(root.left);
        if (root.right != null) travel(root.right);
        count--;
    }
}
