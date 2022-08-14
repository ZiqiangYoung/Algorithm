package leetcode.q6148;

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
        return Stream.of(new BruteForce());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertArrayEquals(MyStr.parseTwoDArrayString2TwoDIntArray("[[9,9],[8,6]]"),
                impl.largestLocal(MyStr.parseTwoDArrayString2TwoDIntArray("[[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]")));
        assertArrayEquals(MyStr.parseTwoDArrayString2TwoDIntArray("[[2,2,2],[2,2,2],[2,2,2]]"),
                impl.largestLocal(MyStr.parseTwoDArrayString2TwoDIntArray("[[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]")));
    }

}