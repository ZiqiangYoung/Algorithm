package leetcode.meituan.q001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/10</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    @Test
    void validateUserName() {
        assertTrue(Solution.validateUserName("YangZiqiang123"));
        assertFalse(Solution.validateUserName("6XHjHJ"));
        assertFalse(Solution.validateUserName("AsFsFsFjsFfs"));
        assertFalse(Solution.validateUserName("AsdC43432哈哈"));
        assertFalse(Solution.validateUserName("DfdSfdG678   *"));
    }
}