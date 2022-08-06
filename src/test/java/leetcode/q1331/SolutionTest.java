package leetcode.q1331;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/28</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new Bubble());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertArrayEquals(MyStr.parse2IntArray("[4,1,2,3]"),
                impl.arrayRankTransform(MyStr.parse2IntArray("[40,10,20,30]")));
        assertArrayEquals(MyStr.parse2IntArray("[1,1,1]"),
                impl.arrayRankTransform(MyStr.parse2IntArray("[100,100,100]")));
        assertArrayEquals(MyStr.parse2IntArray("[5,3,4,2,8,6,7,1,3]"),
                impl.arrayRankTransform(MyStr.parse2IntArray("[37,12,28,9,100,56,80,5,12]")));
    }
}