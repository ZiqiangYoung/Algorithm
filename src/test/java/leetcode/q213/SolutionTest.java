package leetcode.q213;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
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
        assertEquals(2, impl.rob(MyStr.parse2IntArray("[2]")));
        assertEquals(2, impl.rob(MyStr.parse2IntArray("[1,2]")));
        assertEquals(3, impl.rob(MyStr.parse2IntArray("[2,3,2]")));
        assertEquals(3, impl.rob(MyStr.parse2IntArray("[2,3,2]")));
        assertEquals(3, impl.rob(MyStr.parse2IntArray("[1,2,3]")));
        assertEquals(4, impl.rob(MyStr.parse2IntArray("[1,2,3,1]")));
        assertEquals(103, impl.rob(MyStr.parse2IntArray("[1,3,1,3,100]")));
    }

}