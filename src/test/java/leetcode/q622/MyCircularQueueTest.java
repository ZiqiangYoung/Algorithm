package leetcode.q622;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.MyInvoke;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/2</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class MyCircularQueueTest {
    private static Stream<MyCircularQueue> implProvider() {
        return Stream.of(new MyCircularQueue_ListNode(1), new MyCircularQueue_Array(1));
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(MyCircularQueue impl) {
        assertArrayEquals(new Object[]{null, true, true, true, false, 3, true, true, true, 4},
                MyInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"Rear\",\"isFull\",\"deQueue\",\"enQueue\",\"Rear\"]",
                        "[[3],[1],[2],[3],[4],[],[],[],[4],[]]"));

        assertArrayEquals(new Object[]{null, true, true, -1, false, -1, -1, true, false, true, -1, true},
                MyInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"deQueue\",\"Front\",\"deQueue\",\"Front\",\"Rear\",\"enQueue\",\"isFull\",\"deQueue\",\"Rear\",\"enQueue\"]",
                        "[[3],[7],[],[],[],[],[],[0],[],[],[],[3]]"));

        assertArrayEquals(new Object[]{null, true, false},
                MyInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"enQueue\"]",
                        "[[1],[1],[2]]"));

        assertArrayEquals(new Object[]{null, true, true, true, true, true, true, false, false, 0, 0, true},
                MyInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"deQueue\",\"deQueue\",\"isEmpty\",\"isEmpty\",\"Rear\",\"Rear\",\"deQueue\"]",
                        "[[8],[3],[9],[5],[0],[],[],[],[],[],[],[]]"));

    }
}