package leetcode.����;

import java.util.List;

/**
 * @Author fty
 * @Description TODO
 * @Date 2020/5/14 18:30
 * @Version V1.0
 **/
public class ��ת���� {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
