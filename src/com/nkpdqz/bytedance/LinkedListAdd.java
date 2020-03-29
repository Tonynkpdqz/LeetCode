package com.nkpdqz.bytedance;

public class LinkedListAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        int flag = 0;//
        while(l1!=null && l2!= null){
            if(l1.val+l2.val+flag>=10){
                p.val = (l1.val+l2.val+flag)%10;
                flag = 1;
            }else {
                p.val = l1.val+l2.val+flag;
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            p.next = new ListNode(1);
            p = p.next;
        }
        while (l1!=null){
            if(l1.val+flag>=10){
                p.val = (l1.val+flag)%10;
                flag = 1;
            }else {
                p.val = l1.val+flag;
                flag = 0;
            }
            l1 = l1.next;
            p.next = new ListNode(1);
            p = p.next;
        }

        while (l2!=null){
            if(l2.val+flag>=10){
                p.val = (l2.val+flag)%10;
                flag = 1;
            }else {
                p.val = l2.val+flag;
                flag = 0;
            }
            l2 = l2.next;
            p.next = new ListNode(1);
            p = p.next;
        }

        if (flag == 1){
            return res;
        } else{
            p = res;
            while (p.next.next!=null){
                p = p.next;
            }
            p.next = null;
            return res;
        }
    }
}
