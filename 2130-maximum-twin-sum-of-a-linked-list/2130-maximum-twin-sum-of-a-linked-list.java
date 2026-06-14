/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;

        for(int i=0;i<len/2 - 1;i++){
            temp = temp.next;
        }
        ListNode head2 = temp.next;
        temp.next = null;
      
        ListNode head1 = reverse(head);

        return findMaxiTwinSum(head1 , head2);
    }
    private int findMaxiTwinSum(ListNode l1 , ListNode l2){
        int max = Integer.MIN_VALUE;
        while(l1 != null || l2 != null){
            int curr = l1.val + l2.val;
            max = Math.max(curr,max);
            l1 = l1.next;
            l2  = l2.next;
        }
        return max;
    }
    private ListNode reverse(ListNode root){
        ListNode front = null;
        ListNode prev = null;
        ListNode temp = root;

        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
   
}