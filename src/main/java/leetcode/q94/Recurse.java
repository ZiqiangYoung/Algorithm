package leetcode.q94;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Recurse implements Solution {
    private List<Integer> middleOrder;

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        middleOrder = new ArrayList<>();
        travel(root);
        return middleOrder;
    }

    private void travel(TreeNode node) {
        if (node == null) return;
        travel(node.left);
        middleOrder.add(node.val);
        travel(node.right);
    }
}
