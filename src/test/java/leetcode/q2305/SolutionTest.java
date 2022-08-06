package leetcode.q2305;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

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
        return Stream.of(new PruningBacktrace());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(31, impl.distributeCookies(
                MyStr.parse2IntArray("[8,15,10,20,8]"), 2));
        assertEquals(7, impl.distributeCookies(
                MyStr.parse2IntArray("[6,1,3,2,2,4,1,2]"), 3));
        assertEquals(1000, impl.distributeCookies(
                MyStr.parse2IntArray("[64,32,16,8,4,2,1,1000]"), 8));
    }

}