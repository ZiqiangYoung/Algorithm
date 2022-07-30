package leetcode.q100;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
        return Stream.of(new Recurse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.isSameTree(TreeNode.leetcodeInput("[1,2,3]"), TreeNode.leetcodeInput("[1,2,3]")));
        assertFalse(impl.isSameTree(TreeNode.leetcodeInput("[1,2]"), TreeNode.leetcodeInput("[1,null,2]")));
        assertFalse(impl.isSameTree(TreeNode.leetcodeInput("[1,2,1]"), TreeNode.leetcodeInput("[1,1,2]")));
    }

}