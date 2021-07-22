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
        if(head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node pointer = head;
        Node newHead = new Node(head.val);
        Node newPointer = newHead;
        map.put(pointer, newPointer);
        while(pointer.next != null){
            newPointer.next = new Node(pointer.next.val);
            newPointer = newPointer.next;
            pointer = pointer.next;
            map.put(pointer, newPointer);
        }
        pointer = head;
        newPointer = newHead;
        while(pointer != null){
            Node random = map.get(pointer.random);
            newPointer.random = random;
            newPointer = newPointer.next;
            pointer = pointer.next;
        }
        return newHead;
    }
}