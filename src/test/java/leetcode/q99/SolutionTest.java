package leetcode.q99;

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
        TreeNode origin;

        origin = TreeNode.leetcodeInput("[1,3,null,null,2]");
        impl.recoverTree(origin);
        assertArrayEquals(CommonStr.parse2IntegerArray("[3,1,null,null,2]"),
                TreeNode.leetcodeOutput(origin));

        origin = TreeNode.leetcodeInput("[3,1,4,null,null,2]");
        impl.recoverTree(origin);
        assertArrayEquals(CommonStr.parse2IntegerArray("[2,1,4,null,null,3]"),
                TreeNode.leetcodeOutput(origin));
    }

}