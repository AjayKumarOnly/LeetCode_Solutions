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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode high = head.next.next;
        ListNode mid = head.next;
        ListNode low = head;
        int len = 0;
        List<Integer> list = new ArrayList<>();

        while(high != null){

            if(mid.val > low.val && mid.val > high.val){
                list.add(len);
            }
            else if(mid.val < low.val && mid.val < high.val){
                list.add(len);
            }
            high = high.next;
            mid = mid.next;
            low = low.next;
            ++len;
        }
        int ans[] = new int[2];
        Collections.sort(list);

        if (list.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDistance = Math.min(
                minDistance,
                list.get(i) - list.get(i - 1)
            );
        }

        int maxDistance = list.get(list.size() - 1) - list.get(0);

        ans[0] = minDistance;
        ans[1] = maxDistance;
        return ans;
    }
}