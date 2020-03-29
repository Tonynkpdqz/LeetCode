package com.nkpdqz.jingxuan;

public class MergeLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1==null && l2 == null){
            return null;
        }
        ListNode other;
        if (l1.val<l2.val){
            other = l1;
            other.next = mergeTwoLists(l1.next,l2);
        }else {
            other = l2;
            other.next = mergeTwoLists(l1,l2.next);
        }
        return other;
    }

}
