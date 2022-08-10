package leetcode.q55;

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
        return Stream.of(new DP(), new Greedy());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.canJump(MyStr.parse2IntArray("[0]")));
        assertFalse(impl.canJump(MyStr.parse2IntArray("[0,1]")));
        assertTrue(impl.canJump(MyStr.parse2IntArray("[2,3,1,1,4]")));
        assertFalse(impl.canJump(MyStr.parse2IntArray("[3,2,1,0,4]")));
        assertTrue(impl.canJump(MyStr.parse2IntArray("[3,0,8,2,0,0,1]")));
    }

}