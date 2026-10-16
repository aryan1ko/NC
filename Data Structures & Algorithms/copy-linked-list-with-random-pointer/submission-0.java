/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node temp = head;
        while(temp != null) {

            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        //update all random pointers now
        temp = head;

        while(temp != null) {
            Node tempCopy = map.get(temp);
            tempCopy.next = map.get(temp.next);
            Node randomCopy = null;
            if(temp.random != null) {
                randomCopy = map.get(temp.random);
            }
            tempCopy.random = randomCopy;

            temp = temp.next;
        }

        return map.get(head);
    }
}
