package leetcode.q623;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class BFS implements Solution {
    @Override
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, null);
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        for (int i = 2; i < depth; i++) {
            for (int j = 0, sz = level.size(); j < sz; j++) {
                TreeNode poll = level.poll();
                //noinspection ConstantConditions
                if (poll.left != null) level.offer(poll.left);
                if (poll.right != null) level.offer(poll.right);
            }
        }
        for (TreeNode node : level) {
            node.left = new TreeNode(val,node.left,null);
            node.right = new TreeNode(val,null,node.right);
        }
        return root;
    }
}
