package leetcode.q6139;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyStr;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/7</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class SolutionTest {
    private static Stream<Solution> implProvider() {
        return Stream.of(new DFS_adjacencyList(), new BFS_adjacencyList());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(Solution impl) {
        assertEquals(4,impl.reachableNodes(7, MyStr.parseTwoDArrayString2TwoDIntArray(
                "[[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]]"), MyStr.parse2IntArray("[4,5]")));
        assertEquals(3,impl.reachableNodes(7, MyStr.parseTwoDArrayString2TwoDIntArray(
                "[[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]]"), MyStr.parse2IntArray("[4,2,1]")));
    }

}