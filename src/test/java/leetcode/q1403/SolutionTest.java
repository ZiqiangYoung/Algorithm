package leetcode.q1403;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/4</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new Greedy());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(CommonStr.parse2IntegerList("[10,9]"),
                impl.minSubsequence(CommonStr.parse2IntArray("[4,3,10,9,8]")));
        assertEquals(CommonStr.parse2IntegerList("[7,7,6] "),
                impl.minSubsequence(CommonStr.parse2IntArray("[4,4,7,6,7]")));
        assertEquals(CommonStr.parse2IntegerList("[6]"),
                impl.minSubsequence(CommonStr.parse2IntArray("[6]")));
    }

}