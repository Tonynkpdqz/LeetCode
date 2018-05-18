package com.nkpdqz.middle.LinkedList;

public class _01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        while (l1.next!=null||l2.next!=null){
            if (l1.val+l2.val>=10){
                res.val = l1.val+l2.val-10;
                if (l1.next!=null){
                    l1.next.val++;
                }else
                    l2.next.val++;
            }else {
                res.val = l1.val + l2.val;
            }
            if (l1.next!=null){
                l1 = l1.next;
            }else
                l2 = l2.next;
            ListNode ll = new ListNode(0);
            res.next = ll;
            res = res.next;
        }
        return res;
    }

    public ListNode nicer(ListNode l1,ListNode l2){
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1!=null||c2!=null){
            sum/=10;
            if (c1!=null){
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2!=null){
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum%10);
            d = d.next;
        }
        if (sum/10==1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}
