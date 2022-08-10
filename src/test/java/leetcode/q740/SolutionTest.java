package leetcode.q740;

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
        assertEquals(1, impl.deleteAndEarn(MyStr.parse2IntArray("[1]")));
        assertEquals(2, impl.deleteAndEarn(MyStr.parse2IntArray("[1,2]")));
        assertEquals(6, impl.deleteAndEarn(MyStr.parse2IntArray("[3,4,2]")));
        assertEquals(9, impl.deleteAndEarn(MyStr.parse2IntArray("[2,2,3,3,3,4]")));
    }

}