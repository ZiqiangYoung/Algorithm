package leetcode.q919;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/26</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Sentinel extends CBTInserter {
    TreeNode       tree;
    List<TreeNode> sentinel;
    int            index;

    public Sentinel(TreeNode root) {
        super(root);
        tree = root;
        List<TreeNode> level = new ArrayList<>(1);
        level.add(root);
        while (true) {
            int sz = level.size();
            List<TreeNode> newLevel = new ArrayList<>(sz * 2);
            for (int i = 0; i < sz; i++) {
                TreeNode node = level.get(i);
                if (node.left != null) newLevel.add(node.left);
                if (node.right != null) newLevel.add(node.right);
                if (node.left == null || node.right == null) {
                    sentinel = level;
                    index = i;
                    return;
                }
            }
            level = newLevel;
        }
    }

    @Override
    public int insert(int val) {
        TreeNode node = sentinel.get(index);
        if (node.left == null) node.left = new TreeNode(val);
        else {
            node.right = new TreeNode(val);
            if (sentinel.size() - 1 == index) {
                List<TreeNode> newLevel = new ArrayList<>(sentinel.size() * 2);
                for (TreeNode s : sentinel) {
                    newLevel.add(s.left);
                    newLevel.add(s.right);
                }
                sentinel = newLevel;
                index = 0;
            } else index++;
        }
        return node.val;
    }

    @Override
    public TreeNode get_root() {
        return tree;
    }
}
