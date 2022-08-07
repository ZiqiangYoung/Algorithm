package leetcode.q6136;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new ThreePointers());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(2, impl.arithmeticTriplets(MyStr.parse2IntArray("[0,1,4,6,7,10]"), 3));
        assertEquals(2, impl.arithmeticTriplets(MyStr.parse2IntArray("[4,5,6,7,8,9]"), 2));
    }

}