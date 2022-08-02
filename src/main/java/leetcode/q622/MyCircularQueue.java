package leetcode.q622;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/2</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
abstract class MyCircularQueue {
    public MyCircularQueue(int k) {
    }

    public abstract boolean enQueue(int value);

    public abstract boolean deQueue();

    public abstract int Front();

    public abstract int Rear();

    public abstract boolean isEmpty();

    public abstract boolean isFull();
}