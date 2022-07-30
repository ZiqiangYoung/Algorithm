package leetcode.q565;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonIO;
import util.CommonStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/23</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new SelfMarkTraverse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(4, impl.arrayNesting(CommonStr.parse2IntArray(
                "[5,4,0,3,1,6,2]")));
        assertEquals(2, impl.arrayNesting(CommonStr.parse2IntArray(
                "[0,2,1]")));
        assertEquals(20706, impl.arrayNesting(CommonStr.parse2IntArray(
                CommonIO.readResourceAsString("/input/leetcode/q565/intArray1.input"))));
        assertEquals(100000, impl.arrayNesting(CommonStr.parse2IntArray(
                CommonIO.readResourceAsString("/input/leetcode/q565/intArray2.input"))));
    }

}