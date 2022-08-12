package leetcode.q1567;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/12</p>
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
        assertEquals(4, impl.getMaxLen(MyStr.parse2IntArray("[1,-2,-3,4]")));
        assertEquals(3, impl.getMaxLen(MyStr.parse2IntArray("[0,1,-2,-3,-4]")));
        assertEquals(2, impl.getMaxLen(MyStr.parse2IntArray("[-1,-2,-3,0,1]")));
        assertEquals(2, impl.getMaxLen(MyStr.parse2IntArray("[-1,-2,-3,0,1]")));
        assertEquals(1, impl.getMaxLen(MyStr.parse2IntArray("[1000000000]")));
    }

}