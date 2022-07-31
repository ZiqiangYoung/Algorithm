package leetcode.q1161;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import leetcode.q1161.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/31</p>
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
        assertEquals(2, impl.maxLevelSum(TreeNode.leetcodeInput("[1,7,0,7,-8,null,null]")));
        assertEquals(2, impl.maxLevelSum(TreeNode.leetcodeInput("[989,null,10250,98693,-89388,null,null,null,-32127]")));
    }

}