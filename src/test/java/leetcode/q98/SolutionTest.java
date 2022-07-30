package leetcode.q98;

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
        return Stream.of(new Recurse(), new InterruptRecurse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.isValidBST(TreeNode.leetcodeInput("[2,1,3]")));
        assertFalse(impl.isValidBST(TreeNode.leetcodeInput("[5,1,4,null,null,3,6]")));
        assertTrue(impl.isValidBST(TreeNode.leetcodeInput("[-2147483648]")));
    }

}