package leetcode.q1184;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/24</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new Traverse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(1, impl.distanceBetweenBusStops(
                CommonStr.parse2IntArray("[1,2,3,4]"), 0, 1));
        assertEquals(3, impl.distanceBetweenBusStops(
                CommonStr.parse2IntArray("[1,2,3,4]"), 0, 2));
        assertEquals(4, impl.distanceBetweenBusStops(
                CommonStr.parse2IntArray("[1,2,3,4]"), 0, 3));
    }

}