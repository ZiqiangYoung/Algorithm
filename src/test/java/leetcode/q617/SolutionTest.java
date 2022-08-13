package leetcode.q617;

import java.util.Arrays;
import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/13</p>
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
        assertArrayEquals(MyStr.parse2IntegerArray("[3,4,5,5,4,null,7]"),
                TreeNode.leetcodeOutput(impl.mergeTrees(
                        TreeNode.leetcodeInput("[1,3,2,5]"),
                        TreeNode.leetcodeInput("[2,1,3,null,4,null,7]"))));

        assertArrayEquals(MyStr.parse2IntegerArray("[2,2]"),
                TreeNode.leetcodeOutput(impl.mergeTrees(
                        TreeNode.leetcodeInput("[1]"),
                        TreeNode.leetcodeInput("[1,2]"))));
    }

}