package com.nkpdqz.middle.LinkedList;

public class _03 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null||headB==null)
            return null;
        int hal = 0;
        int hbl = 0;
        ListNode p = headA;
        while (p!=null){
            ++hal;
            p = p.next;
        }
        p = headB;
        while (p!=null){
            ++hbl;
            p = p.next;
        }
        while (hal>hbl){
            headA = headA.next;
            hal--;
        }
        while (hbl>hal){
            headB = headB.next;
            hbl--;
        }
        while (headA!=null){
            if (headA==headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
