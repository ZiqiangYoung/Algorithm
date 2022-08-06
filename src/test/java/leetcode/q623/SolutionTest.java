package leetcode.q623;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new BFS());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertArrayEquals(CommonStr.parse2IntegerArray("[4,1,1,2,null,null,6,3,1,5]"),
                TreeNode.leetcodeOutput(impl.addOneRow(
                        TreeNode.leetcodeInput("[4,2,6,3,1,5]"), 1, 2)));
        assertArrayEquals(CommonStr.parse2IntegerArray("[4,2,null,1,1,3,null,null,1]"),
                TreeNode.leetcodeOutput(impl.addOneRow(
                        TreeNode.leetcodeInput("[4,2,null,3,1]"), 1, 3)));
        assertArrayEquals(CommonStr.parse2IntegerArray("[1,4,null,2,null,3,1]"),
                TreeNode.leetcodeOutput(impl.addOneRow(
                        TreeNode.leetcodeInput("[4,2,null,3,1]"), 1, 1)));
    }

}