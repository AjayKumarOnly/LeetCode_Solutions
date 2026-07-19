/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        int ans = 0;
    public int countDominantNodes(TreeNode root) {
        find(root);
        return ans;
    }
    private int find(TreeNode root){
        if(root == null) return -1;
        int l = find(root.left);
        int r = find(root.right);
        int max = Math.max(root.val,Math.max(l,r));

        if(root.val == max) ans++;
        return max;
    }
}