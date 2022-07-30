package leetcode.q919;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/25</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Heap extends CBTInserter {
    TreeNode       tree;
    List<TreeNode> nodeList;
    int            level;

    public Heap(TreeNode root) {
        super(root);
        tree = root;
        nodeList = new LinkedList<>();
        nodeList.add(root);
        level = 1;
        while (true) {
            int sz = nodeList.size();
            for (int i = (1 << (level - 1)) - 1; i < sz; i++) {
                TreeNode node = nodeList.get(i);
                if (node.left != null) nodeList.add(node.left);
                if (node.right != null) nodeList.add(node.right);
            }
            if (nodeList.size() < 1 << (level - 1)) return;
            level++;
        }
    }

    @Override
    public int insert(int val) {
        TreeNode node = new TreeNode(val);
        nodeList.add(node);
        int sz = nodeList.size();
        if (sz > (1 << level) - 1) level++;
        TreeNode father = nodeList.get((sz - 2) / 2);
        if (father.left == null) father.left = node;
        else father.right = node;
        return father.val;
    }

    @Override
    public TreeNode get_root() {
        return tree;
    }
}
