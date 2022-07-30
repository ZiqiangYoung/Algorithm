package leetcode.q919;

import java.util.stream.Stream;

import leetcode.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/26</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class CBTInserterTest {
    private static Stream<CBTInserter> implProvider() {
        return Stream.of(new Heap(new TreeNode()),new Sentinel(new TreeNode()));
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(CBTInserter impl) throws Exception {
        CBTInserter cBTInserter;

        cBTInserter = impl.getClass().getDeclaredConstructor(TreeNode.class).newInstance(TreeNode.leetcodeInput("[1, 2]"));
        assertEquals(1, cBTInserter.insert(3));
        assertEquals(2, cBTInserter.insert(4));
        assertArrayEquals(CommonStr.parse2IntegerArray("[1, 2, 3, 4]"),
                TreeNode.leetcodeOutput(cBTInserter.get_root()));

        cBTInserter = impl.getClass().getDeclaredConstructor(TreeNode.class).newInstance(TreeNode.leetcodeInput("[1,2,3,4,5,6]"));
        assertEquals(3, cBTInserter.insert(7));
        assertEquals(4, cBTInserter.insert(8));
        assertArrayEquals(CommonStr.parse2IntegerArray("[1, 2, 3, 4, 5, 6, 7, 8]"),
                TreeNode.leetcodeOutput(cBTInserter.get_root()));
    }

}