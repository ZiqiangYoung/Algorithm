package leetcode.q622;

import leetcode.common.ListNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/8/2</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class MyCircularQueue_ListNode extends MyCircularQueue {
    final int capped;
    int      size;
    ListNode head, tail;

    public MyCircularQueue_ListNode(int k) {
        super(k);
        capped = k;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (size == 0) head = tail = new ListNode(value);
        else if (size < capped) {
            tail = tail.next = new ListNode(value);
            if (size == 1) head.next = tail;
        } else return false;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else if (size > 0) {
            head = head.next;
            size--;
        } else return false;
        return true;
    }

    public int Front() {
        return head == null ? -1 : head.val;
    }

    public int Rear() {
        return tail == null ? -1 : tail.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capped;
    }
}
