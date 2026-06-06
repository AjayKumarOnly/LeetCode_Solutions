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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                temp.add(queue.poll().val);
            }
            res.add(temp);
        }
        return res;
    }
}