package com.nkpdqz.junior.LinkedList;

public class _04 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            return null;
        }
        if (l1==null|| l2==null){
            return l1==null?l2:l1;
        }
        ListNode p = new ListNode(0);
        ListNode h = new ListNode(0);
        ListNode newH = new ListNode(0);
        p.next = l1;
        h.next = l2;
        while (p.next!=null){
            while (h.next!=null){
                if (p.next.val<=h.next.val){
                    newH.next = p.next;
                    newH = newH.next;
                    p = p.next;
                    break;
                }else {
                    newH.next = h.next;
                    newH = newH.next;
                    h = h.next;
                }
            }
        }
        return newH;
    }

    public ListNode mergeTwoListsNicer(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = null;
        if(p1.val < p2.val){
            head = p1;
            p1 = p1.next;
        }else{
            head = p2;
            p2 = p2.next;
        }
        ListNode p = head;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                p.next = p1;
                p = p.next;
                p1 = p1.next;
            }else{
                p.next = p2;
                p = p.next;
                p2 = p2.next;
            }
        }
        if(p1 != null){
            p.next = p1;
        }
        if(p2 != null){
            p.next = p2;
        }
        return head;
    }
}
