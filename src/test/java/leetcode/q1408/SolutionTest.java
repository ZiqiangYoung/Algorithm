package leetcode.q1408;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyCollections;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
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
        assertIterableEquals(MyCollections.sort(MyStr.parse2StringList("[\"as\",\"hero\"]")),
                MyCollections.sort(impl.stringMatching(
                        MyStr.parse2StringArray("[\"mass\",\"as\",\"hero\",\"superhero\"]"))));
        assertIterableEquals(MyCollections.sort(MyStr.parse2StringList("[\"et\",\"code\"]")),
                MyCollections.sort(impl.stringMatching(
                        MyStr.parse2StringArray("[\"leetcode\",\"et\",\"code\"]"))));
        assertIterableEquals(MyCollections.sort(MyStr.parse2StringList("[]")),
                MyCollections.sort(impl.stringMatching(
                        MyStr.parse2StringArray("[\"blue\",\"green\",\"bu\"]"))));
    }

}