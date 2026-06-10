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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root,0));
        int maxWidth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int stInd = q.peek().getValue();
            int endInd = ((LinkedList<Pair<TreeNode,Integer>>) q).getLast().getValue();
            maxWidth = Math.max(maxWidth,endInd - stInd + 1);

            for(int i = 0; i < size;i++){
                Pair<TreeNode,Integer> curr = q.poll();
                TreeNode node = curr.getKey();
                int ind = curr.getValue();

                if(node.left != null) q.offer(new Pair<>(node.left,ind * 2));
                if(node.right != null) q.offer(new Pair<>(node.right,ind * 2 + 1));
            }
        }
        return maxWidth;
    }
}