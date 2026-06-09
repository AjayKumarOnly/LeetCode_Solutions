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
    long ans = Long.MAX_VALUE;
    int min;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        dfs(root);

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }

    private void dfs(TreeNode root) {
        if(root == null) return;

        if(root.val > min && root.val < ans) {
            ans = root.val;
        }

        dfs(root.left);
        dfs(root.right);
    }
}