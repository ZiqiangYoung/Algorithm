package leetcode.q2;

import leetcode.common.ListNode;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/16</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
class Simulate implements Solution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            if (head == null) head = tail = new ListNode((n1 + n2 + carry) % 10);
            else {
                tail.next = new ListNode((n1 + n2 + carry) % 10);
                tail = tail.next;
            }
            carry = (n1 + n2 + carry) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(1);
        }
        return head;
    }
}
