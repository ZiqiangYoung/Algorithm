package leetcode.q593;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/29</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new Mathematics());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.validSquare(
                MyStr.parse2IntArray("[ 0, 0]"),
                MyStr.parse2IntArray("[ 1, 1]"),
                MyStr.parse2IntArray("[ 1, 0]"),
                MyStr.parse2IntArray("[ 0, 1]")));
        assertFalse(impl.validSquare(
                MyStr.parse2IntArray("[ 0, 0]"),
                MyStr.parse2IntArray("[ 1, 1]"),
                MyStr.parse2IntArray("[ 1, 0]"),
                MyStr.parse2IntArray("[ 0, 12]")));
        assertTrue(impl.validSquare(
                MyStr.parse2IntArray("[ 1, 0]"),
                MyStr.parse2IntArray("[-1, 0]"),
                MyStr.parse2IntArray("[ 0, 1]"),
                MyStr.parse2IntArray("[ 0,-1]")));
        assertFalse(impl.validSquare(
                MyStr.parse2IntArray("[ 0, 0]"),
                MyStr.parse2IntArray("[ 0, 0]"),
                MyStr.parse2IntArray("[ 0, 0]"),
                MyStr.parse2IntArray("[ 0, 0]")));
        assertFalse(impl.validSquare(
                MyStr.parse2IntArray("[ 1, 2]"),
                MyStr.parse2IntArray("[ 1, 1]"),
                MyStr.parse2IntArray("[ 2, 0]"),
                MyStr.parse2IntArray("[ 2, 2]")));
        assertTrue(impl.validSquare(
                MyStr.parse2IntArray("[ 1, 0]"),
                MyStr.parse2IntArray("[ 0, 1]"),
                MyStr.parse2IntArray("[-1, 0]"),
                MyStr.parse2IntArray("[ 0, -1]")));

    }

}