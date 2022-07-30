package leetcode.q110;

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
        return Stream.of(new Recurse(),new InterruptRecurse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.isBalanced(TreeNode.leetcodeInput("[3,9,20,null,null,15,7]")));
        assertFalse(impl.isBalanced(TreeNode.leetcodeInput("[1,2,2,3,3,null,null,4,4]")));
        assertTrue(impl.isBalanced(TreeNode.leetcodeInput("[]")));
    }

}