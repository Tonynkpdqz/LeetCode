package com.nkpdqz.junior.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class _05 {

    public static void main(String[] args) {
        ListNode head = new ListNode(-129);
        head.next = new ListNode(-129);
        boolean palindrome = isPalindrome(head);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        int length = 1;
        if (head == null)
            return true;
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        while (head.next != null) {
            head = head.next;
            list.add(head.val);
            length++;
        }
        Object[] array =  list.toArray();
        for (int i = 0; i < length / 2; i++) {
            int j = (int) array[i];
            int k = (int) array[length-1-i];
            if (j==k) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
