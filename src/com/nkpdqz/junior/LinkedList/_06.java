package com.nkpdqz.junior.LinkedList;

public class _06 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode h = head;
        if (head==null){
            return false;
        }
        while(p.next!=null && p.next.next != null){
            p = p.next.next;
            h = h.next;
            if (p.val == h.val)
                return true;
        }
        return false;
    }
}
