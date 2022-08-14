package leetcode.q6149;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/14</p>
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
        assertEquals(7, impl.edgeScore(MyStr.parse2IntArray("[1,0,0,0,0,7,7,5]")));
        assertEquals(0, impl.edgeScore(MyStr.parse2IntArray("[2,0,0,2]")));
        assertEquals(0, impl.edgeScore(MyStr.parse2IntArray("[3,3,3,0]")));
    }

}