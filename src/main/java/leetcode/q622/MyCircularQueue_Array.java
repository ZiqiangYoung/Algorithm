package leetcode.q622;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/3</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class MyCircularQueue_Array extends MyCircularQueue {
    int[] circularQueue;
    int   head, tail, capped, size;

    public MyCircularQueue_Array(int k) {
        super(k);
        circularQueue = new int[capped = k];
        head = tail = -1;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (size < capped) {
            if (size == 0) tail = head = 0;
            else tail = (tail + capped + 1) % capped;
            size++;
            circularQueue[tail] = value;
            return true;
        } else return false;
    }

    public boolean deQueue() {
        if (size > 0) {
            if (--size == 0) tail = head = -1;
            else head = (head + capped + 1) % capped;
            return true;
        } else return false;
    }

    public int Front() {
        if (size == 0) return -1;
        else return circularQueue[head];
    }

    public int Rear() {
        if (size == 0) return -1;
        else return circularQueue[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capped;
    }
}
