package leetcode.common;

import util.MyStr;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class TreeNode {
    private static int      counterForCreateTree;
    public         int      val;
    public         TreeNode left;
    public         TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode preOrderCreate(String arrayStr) {
        Integer[] integers = MyStr.parse2IntegerArray(arrayStr);
        synchronized (TreeNode.class) {
            return preOrderCreate(integers);
        }
    }

    public static TreeNode preOrderCreate(Integer[] array) {
        TreeNode root;

        if (counterForCreateTree >= array.length || array[counterForCreateTree++] == null) root = null;
        else {
            root = new TreeNode(array[counterForCreateTree - 1]);
            root.left = preOrderCreate(array);
            root.right = preOrderCreate(array);
        }
        return root;
    }

    private static TreeNode[] arrString2TreeNodeArray(String arrayStr) {
        Integer[] integers = MyStr.parse2IntegerArray(arrayStr);
        TreeNode[] treeNodes = new TreeNode[integers.length];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != null) {
                treeNodes[i] = new TreeNode(integers[i]);
            }
        }
        return treeNodes;
    }

    private static LinkedList<TreeNode> arrString2TreeNodeList(String arrayStr) {
        Integer[] integers = MyStr.parse2IntegerArray(arrayStr);
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        for (Integer integer : integers) {
            treeNodes.add(integer == null ? null : new TreeNode(integer));
        }
        return treeNodes;
    }

    public static TreeNode binaryHeap2Tree(String arrayStr) {
        TreeNode[] treeNodes = arrString2TreeNodeArray(arrayStr);
        int count = treeNodes.length;

        int level = (int) Math.ceil(Math.log(count + 1) / Math.log(2));
        for (int i = 0; i < level; i++) {
            for (int ij = 0; ij < Math.pow(2, i); ij++) {
                int base = (int) Math.pow(2, i) - 1;
                int index = base + ij;
                int leftIndex = 2 * index + 1;
                int rightIndex = leftIndex + 1;
                /* 该节点为null，其不应该有子节点 */
                if (index >= count || treeNodes[index] == null)
                    continue;
                /* 非null节点必须存在父节点(除了root)，否则不连通 */
                if (treeNodes[(index - 1) / 2] == null && index != 0)
                    throw new RuntimeException("输入的二叉堆序列有问题：索引为" + index + "的非null节点，其父节点为null");
                if (leftIndex < count)
                    treeNodes[index].left = treeNodes[leftIndex];
                if (rightIndex < count)
                    treeNodes[index].right = treeNodes[rightIndex];
            }
        }
        return treeNodes[0];
    }

    public static TreeNode leetcodeInput(String arrayStr) {
        Queue<TreeNode> treeNodes = arrString2TreeNodeList(arrayStr);
        TreeNode root = treeNodes.poll();
        Queue<TreeNode> level = new LinkedList<>();
        level.offer(root);
        while (!treeNodes.isEmpty() || !level.isEmpty()) {
            int sz = level.size();
            while (sz > 0) {
                TreeNode node = level.poll();
                sz--;
                if (node != null) {
                    node.left = treeNodes.poll();
                    if (node.left != null) level.offer(node.left);
                    node.right = treeNodes.poll();
                    if (node.right != null) level.offer(node.right);
                }
            }
        }
        return root;
    }

    public static Integer[] leetcodeOutput(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        int sz;
        if (root != null) level.offer(root);
        else return new Integer[0];
        result.add(root.val);

        while ((sz = level.size()) > 0) {
            while (sz-- > 0) {
                root = level.poll();
                assert root != null;
                if (root.left != null) {
                    level.offer(root.left);
                    result.add(root.left.val);
                } else result.add(null);
                if (root.right != null) {
                    level.offer(root.right);
                    result.add(root.right.val);
                } else result.add(null);
            }
        }
        while (result.peekLast() == null) result.pollLast();
        return result.toArray(new Integer[0]);
    }
}