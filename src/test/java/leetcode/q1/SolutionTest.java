package leetcode.q1;

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
        return Stream.of(new Enumerate(), new HashMapCache());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {

        assertArrayEquals(impl.twoSum(CommonStr.parse2IntArray("[2,7,11,15]"), 9),
                CommonStr.parse2IntArray("[0,1]"));
        assertArrayEquals(impl.twoSum(CommonStr.parse2IntArray("[3,2,4]"), 6),
                CommonStr.parse2IntArray("[1,2]"));
        assertArrayEquals(impl.twoSum(CommonStr.parse2IntArray("[3,3]"), 6),
                CommonStr.parse2IntArray("[0,1]"));
        assertArrayEquals(impl.twoSum(CommonStr.parse2IntArray("[1,1]"), 3),
                CommonStr.parse2IntArray("[]"));
    }

}