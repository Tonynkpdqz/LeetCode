package com.nkpdqz.junior.LinkedList;

public class _02 {
    public static void main(String[] args) {

    }

    public static ListNode02 removeNthFromEnd(ListNode02 head, int n) {
        ListNode02 newhead = new ListNode02(0);
        newhead.next = head;
        ListNode02 realhead = new ListNode02(0);
        realhead.next = head;
        newhead = newhead.next;
        if (n == 1 && head.next == null){
            return null;
        }
        while (newhead!=null){
            if (n>0){
                newhead = newhead.next;
                n--;
            }else if (n == 0){
                newhead = newhead.next;
                head = head.next;
            }
            if (newhead.next == null){
                if (n==1){
                    return realhead.next.next;
                }
                if (head.next.next==null){
                    head.next = null;
                }else {
                    head.next = head.next.next;
                }
                break;
            }
        }
        return realhead.next;
        /*while (newhead.next != null){
            newhead = head.next;
            length++;
        }
        if (length == n){
            return head.next;
        }
        for (int i = 0; i < length-n-1; i++) {
            newhead = head.next;
        }
        newhead.val = newhead.next.val;
        newhead.next = newhead.next.next;
        return realhead;*/
    }
}


class ListNode02 {
    int val;
    ListNode02 next;
    ListNode02(int x) { val = x; }
}