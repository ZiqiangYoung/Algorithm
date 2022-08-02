package leetcode.q622;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonInvoke;

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
        return Stream.of(new MyCircularQueue_ListNode(3));
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(MyCircularQueue impl) {
        assertArrayEquals(new Object[]{null, true, true, true, false, 3, true, true, true, 4},
                CommonInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"Rear\",\"isFull\",\"deQueue\",\"enQueue\",\"Rear\"]",
                        "[[3],[1],[2],[3],[4],[],[],[],[4],[]]"));

        assertArrayEquals(new Object[]{null, true, true, -1, false, -1, -1, true, false, true, -1, true},
                CommonInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"deQueue\",\"Front\",\"deQueue\",\"Front\",\"Rear\",\"enQueue\",\"isFull\",\"deQueue\",\"Rear\",\"enQueue\"]",
                        "[[3],[7],[],[],[],[],[],[0],[],[],[],[3]]"));

        assertArrayEquals(new Object[]{null, true, false},
                CommonInvoke.listInvoke(MyCircularQueue.class, impl.getClass(),
                        "[\"MyCircularQueue\",\"enQueue\",\"enQueue\"]",
                        "[[1],[1],[2]]"));

    }
}