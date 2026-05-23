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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode smallTail = small;

        ListNode large = new ListNode(-1);
        ListNode largeTail = large;

        ListNode temp = head;
        

        while(temp != null){
            if(temp.val < x){
                smallTail.next = temp;
                smallTail = smallTail.next;
                
            }
            else {
                largeTail.next = temp;
                largeTail = largeTail.next;
            }
            temp = temp.next;
        }
       smallTail.next = large.next;
       largeTail.next = null;
       return small.next;
    }
}