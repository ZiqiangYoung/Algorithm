package leetcode.q2;

import java.util.stream.Stream;

import leetcode.common.ListNode;
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
        return Stream.of(new Simulate());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertArrayEquals(
                CommonStr.parse2IntArray("[7,0,8]"),
                ListNode.leetcodeOutput(impl.addTwoNumbers(
                        ListNode.leetcodeInput("[2,4,3]"),
                        ListNode.leetcodeInput("[5,6,4]"))));
        assertArrayEquals(
                CommonStr.parse2IntArray("[0]"),
                ListNode.leetcodeOutput(impl.addTwoNumbers(
                        ListNode.leetcodeInput("[0]"),
                        ListNode.leetcodeInput("[0]"))));
        assertArrayEquals(
                CommonStr.parse2IntArray("[8,9,9,9,0,0,0,1]"),
                ListNode.leetcodeOutput(impl.addTwoNumbers(
                        ListNode.leetcodeInput("[9,9,9,9,9,9,9]"),
                        ListNode.leetcodeInput("[9,9,9,9]"))));
    }

}