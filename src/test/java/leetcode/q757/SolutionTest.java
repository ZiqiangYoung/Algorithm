package leetcode.q757;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
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
        return Stream.of(new Greedy());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(3, impl.intersectionSizeTwo(
                CommonStr.parseTwoDArrayString2TwoDIntArray("[[1, 3], [1, 4], [2, 5], [3, 5]]")
        ));

        assertEquals(5, impl.intersectionSizeTwo(
                CommonStr.parseTwoDArrayString2TwoDIntArray("[[1, 2], [2, 3], [2, 4], [4, 5]]")
        ));

        assertEquals(5, impl.intersectionSizeTwo(
                CommonStr.parseTwoDArrayString2TwoDIntArray("[[1,3],[3,7],[5,7],[7,8]]")
        ));

        assertEquals(3, impl.intersectionSizeTwo(
                CommonStr.parseTwoDArrayString2TwoDIntArray("[[1,2],[0,3],[2,3]]")
        ));
    }

}