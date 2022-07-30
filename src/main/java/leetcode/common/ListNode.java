package leetcode.common;

import util.CommonStr;

import java.util.LinkedList;
import java.util.List;

/**
 * <strong>TODO:Class Doc required</strong>
 * <p>Created by ZiqiangYoung on 2022/7/18</p>
 *
 * @author ZiqiangYoung, ziqiangyoung@foxmail.com
 * @version V0.1.0
 **/
public class ListNode {
    public int      val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    private static ListNode[] arrString2ListNodeArray(String arrayStr) {
        Integer[] integers = CommonStr.parse2IntegerArray(arrayStr);
        ListNode[] listNodes = new ListNode[integers.length];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != null) {
                listNodes[i] = new ListNode(integers[i]);
            }
        }
        return listNodes;
    }

    public static ListNode leetcodeInput(String arrStr) {
        ListNode[] listNodes = arrString2ListNodeArray(arrStr);
        for (int i = 0; i < listNodes.length - 1; i++) {
            listNodes[i].next = listNodes[i + 1];
        }
        return listNodes[0];
    }

    public static int[] leetcodeOutput(ListNode node) {
        List<Integer> ans = new LinkedList<>();
        while (node != null) {
            ans.add(node.val);
            node = node.next;
        }
        return ans.stream().mapToInt(value -> value).toArray();
    }
}
