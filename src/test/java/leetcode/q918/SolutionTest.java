package leetcode.q918;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/11</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new DP());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(3, impl.maxSubarraySumCircular(MyStr.parse2IntArray("[1,-2,3,-2]")));
        assertEquals(10, impl.maxSubarraySumCircular(MyStr.parse2IntArray("[5,-3,5]")));
        assertEquals(3, impl.maxSubarraySumCircular(MyStr.parse2IntArray("[3,-2,2,-3]")));
        assertEquals(-2, impl.maxSubarraySumCircular(MyStr.parse2IntArray("[-3,-2,-3]")));
    }

}