package leetcode.q53;

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
        assertEquals(6, impl.maxSubArray(MyStr.parse2IntArray("[-2,1,-3,4,-1,2,1,-5,4]")));
        assertEquals(1, impl.maxSubArray(MyStr.parse2IntArray("[1]")));
        assertEquals(23, impl.maxSubArray(MyStr.parse2IntArray("[5,4,-1,7,8]")));
        assertEquals(-2,impl.maxSubArray(MyStr.parse2IntArray("[-3,-2,-3]")));
    }

}