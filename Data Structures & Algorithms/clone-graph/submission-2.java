/*
Definition for a Node.
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
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();

        if(node == null) {
            return node;
        }
        return dfs(map, node);
    }

    private Node dfs(Map<Node, Node> map, Node old) {
        if(map.containsKey(old)) {
            return map.get(old);
        }


        Node copy = new Node(old.val);
        map.put(old, copy);

        for(Node nei : old.neighbors) {
            copy.neighbors.add(dfs(map, nei));
        }

        return copy;
    }
}