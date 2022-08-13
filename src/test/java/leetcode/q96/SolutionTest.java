package leetcode.q96;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

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
        //noinspection deprecation
        return Stream.of(new DP(), new GlobalDP_recurse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(1, impl.numTrees(1));
        assertEquals(2, impl.numTrees(2));
        assertEquals(5, impl.numTrees(3));
        assertEquals(14, impl.numTrees(4));
        assertEquals(42, impl.numTrees(5));
        assertEquals(1767263190, impl.numTrees(19));
    }

}