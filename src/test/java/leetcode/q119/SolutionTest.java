package leetcode.q119;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
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
        return Stream.of(new DP());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertIterableEquals(MyStr.parse2IntegerList("[1,3,3,1]"),
                impl.getRow(3));
        assertIterableEquals(MyStr.parse2IntegerList("[1]"),
                impl.getRow(0));
        assertIterableEquals(MyStr.parse2IntegerList("[1,1]"),
                impl.getRow(1));
        assertIterableEquals(MyStr.parse2IntegerList("[1,33,528,5456,40920,237336,1107568,4272048,13884156,38567100,92561040,193536720,354817320,573166440,818809200,1037158320,1166803110,1166803110,1037158320,818809200,573166440,354817320,193536720,92561040,38567100,13884156,4272048,1107568,237336,40920,5456,528,33,1]"),
                impl.getRow(33));
    }

}