import java.util.Scanner;

public class _001 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);*/
        Solution solution  = new Solution();
        ListNode listNode = solution.addTwoNumbers(new ListNode(2), new ListNode(3));
        System.out.println(listNode.val);
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int carry = 0;
        ListNode pointer = res;
        while (null!=l1 || null != l2){
            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            pointer.next = new ListNode(carry%10);
            carry /= 10;
            pointer = pointer.next;
        }
        if (carry > 0){
            pointer.next = new ListNode(carry);
        }
        return res.next;
    }
}