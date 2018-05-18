package com.nkpdqz.junior.LinkedList;

public class _03 {
    public static void main(String[] args) {

    }

    /*
    * 迭代
     */
    public static ListNode03 reverseList(ListNode03 head) {
         ListNode03 pre = null;
         ListNode03 next = null;
         while(head!=null){
             next = head.next;
             head.next = pre;
             pre = head;
             head = next;
         }
         return pre;
    }

    //递归
    public static ListNode reverseList2(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode h = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return h;
    }
}

class ListNode03 {
    int val;
    ListNode03 next;
    ListNode03(int x) { val = x; }
}
