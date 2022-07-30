package leetcode.q94;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonStr;

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
        assertEquals(impl.inorderTraversal(TreeNode.leetcodeInput("[1,null,2,3]")),
                CommonStr.parse2IntegerList("[1,3,2]"));
        assertEquals(impl.inorderTraversal(TreeNode.leetcodeInput("[]")),
                CommonStr.parse2IntegerList("[]"));
        assertEquals(impl.inorderTraversal(TreeNode.leetcodeInput("[1]")),
                CommonStr.parse2IntegerList("[1]"));
    }

}