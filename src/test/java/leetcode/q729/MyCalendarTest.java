package leetcode.q729;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import util.CommonInvoke;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/23</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class MyCalendarTest {
    private static Stream<MyCalendar> implProvider() {
        return Stream.of(new MyCalendar_traverse());
    }

    @ParameterizedTest
    @MethodSource("implProvider")
    void implTest(MyCalendar impl) {
        Map<String, Class<?>[]> methodParamTypeMap = new HashMap<>();
        methodParamTypeMap.put("MyCalendar", new Class[0]);
        methodParamTypeMap.put("book", new Class[]{int.class, int.class});

        assertArrayEquals(
                new Object[]{null, true, false, true}
                ,
                CommonInvoke.listInvoke(impl.getClass(),
                        "[\"MyCalendar\", \"book\", \"book\", \"book\"]",
                        "[[], [10, 20], [15, 25], [20, 30]]",
                        MyCalendar.class, methodParamTypeMap));

        assertArrayEquals(
                new Object[]{null, true, false, true, false, false}
                ,
                CommonInvoke.listInvoke(impl.getClass(),
                        "[\"MyCalendar\",\"book\",\"book\",\"book\",\"book\",\"book\"]",
                        "[[],[37,50],[33,50],[4,17],[35,48],[8,25]]",
                        MyCalendar.class, methodParamTypeMap));

        assertArrayEquals(
                new Object[]{null, true, true, false, false, true, false, true, true, true, false}
                ,
                CommonInvoke.listInvoke(impl.getClass(),
                        "[\"MyCalendar\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\"]",
                        "[[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]",
                        MyCalendar.class, methodParamTypeMap));

        assertArrayEquals(
                new Object[]{null, true, false, true, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}
                ,
                CommonInvoke.listInvoke(impl.getClass(),
                        "[\"MyCalendar\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\"]",
                        "[[],[20,29],[13,22],[44,50],[1,7],[2,10],[14,20],[19,25],[36,42],[45,50],[47,50],[39,45],[44,50],[16,25],[45,50],[45,50],[12,20],[21,29],[11,20],[12,17],[34,40],[10,18],[38,44],[23,32],[38,44],[15,20],[27,33],[34,42],[44,50],[35,40],[24,31]]",
                        MyCalendar.class, methodParamTypeMap));

        assertArrayEquals(
                new Object[]{null, true, true, false, false, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, true}
                ,
                CommonInvoke.listInvoke(impl.getClass(),
                        "[\"MyCalendar\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\",\"book\"]",
                        "[[],[97,100],[33,51],[89,100],[83,100],[75,92],[76,95],[19,30],[53,63],[8,23],[18,37],[87,100],[83,100],[54,67],[35,48],[58,75],[70,89],[13,32],[44,63],[51,62],[2,15]]",
                        MyCalendar.class, methodParamTypeMap));
    }

}