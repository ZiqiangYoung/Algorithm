package leetcode.q814;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/23</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new Traverse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertArrayEquals(MyStr.parse2IntegerArray("[1,null,0,null,1]"),
                TreeNode.leetcodeOutput(impl.pruneTree(TreeNode.leetcodeInput("[1,null,0,0,1]"))));

        assertArrayEquals(MyStr.parse2IntegerArray("[1,null,1,null,1]"),
                TreeNode.leetcodeOutput(impl.pruneTree(TreeNode.leetcodeInput("[1,0,1,0,0,0,1]"))));

        assertArrayEquals(MyStr.parse2IntegerArray("[1,1,0,1,1,null,1]"),
                TreeNode.leetcodeOutput(impl.pruneTree(TreeNode.leetcodeInput("[1,1,0,1,1,0,1,0]"))));

        assertArrayEquals(MyStr.parse2IntegerArray("[0,null,0,1,1,null,1,null,1]"),
                TreeNode.leetcodeOutput(impl.pruneTree(TreeNode.leetcodeInput("[0,null,0,1,1,null,1,null,1,null,null,null,null]"))));
    }

}