package leetcode.q919;

import leetcode.common.TreeNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/25</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
abstract class CBTInserter {
    public CBTInserter(TreeNode root) {
    }

    public abstract int insert(int val);

    public abstract TreeNode get_root();
}