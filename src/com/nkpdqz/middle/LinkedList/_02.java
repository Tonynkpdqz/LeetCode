package com.nkpdqz.middle.LinkedList;

public class _02 {
    public ListNode oddEvenList(ListNode head) {
        if (head==null)
            return null;
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head.next;
        while (p.next!=null&&q.next!=null){
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = r;
        return head;
    }
}
