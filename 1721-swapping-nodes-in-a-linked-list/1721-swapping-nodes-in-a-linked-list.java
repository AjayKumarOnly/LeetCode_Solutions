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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0 ;

        while(temp != null){
            temp = temp.next;
            len++;
        }
        int first = k;
        int second = len - k + 1;

        ListNode firstNode = head;
        ListNode secondNode = head;
        for(int i = 1; i < first;i++){
            firstNode = firstNode.next;
        }
        for(int i = 1; i < second;i++){
            secondNode  = secondNode.next;
        }
        int temp1 = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp1;
        return head;
    }
}