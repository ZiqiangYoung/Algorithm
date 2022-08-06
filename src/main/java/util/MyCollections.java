package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/6</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class MyCollections {
    @SafeVarargs
    public static <E> ArrayList<E> toArrayList(E... e) {
        ArrayList<E> list = new ArrayList<>(e.length);
        Collections.addAll(list, e);
        return list;
    }

    public static <T extends Comparable<? super T>, K extends List<T>> K sort(K list) {
        Collections.sort(list);
        return list;
    }
}
