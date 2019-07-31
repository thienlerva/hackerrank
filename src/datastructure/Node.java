package datastructure;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    static int countNodes(Node head) {
        if (head == null) {
            throw new NullPointerException("can't be null");
        }
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);
        Node nodeE = new Node(2);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println(Node.countNodes(null));

    }
}
