package com.nkpdqz.jingxuan;

public class fanZhaunLianBiao {
    public ListNode reverseList(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList2(ListNode head){
        ListNode RLH = null;
        ListNode Pnode = head;
        ListNode Ppriv = null;
        while (Pnode!=null){
            ListNode pNext = Pnode.next;
            if (pNext==null){
                RLH = Pnode;
            }
            Pnode.next = Ppriv;
            Ppriv = Pnode;
            Pnode = pNext;
        }
        return RLH;
    }


}
