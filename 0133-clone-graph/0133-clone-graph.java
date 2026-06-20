/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> mpp = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        
        Node newNode = new Node(node.val);
        mpp.put(node,newNode);

        for(Node neighbor : node.neighbors){
            if(mpp.containsKey(neighbor)){
                newNode.neighbors.add(mpp.get(neighbor));
            }
            else 
                newNode.neighbors.add(cloneGraph(neighbor));
        }
        return newNode;
    }
}