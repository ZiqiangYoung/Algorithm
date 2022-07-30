package leetcode.q207;

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
        return Stream.of(new Topology());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertTrue(impl.canFinish(2, CommonStr.parseTwoDArrayString2TwoDIntArray("[[1,0]]")));
        assertFalse(impl.canFinish(2, CommonStr.parseTwoDArrayString2TwoDIntArray("[[1,0],[0,1]]")));
    }

}