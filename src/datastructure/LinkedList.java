package datastructure;

public class LinkedList {

    Node head;

    public void add(int data) {


        if (head==null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);

    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void insertAtIndex(int index, int data) {
        Node current = head;
        int count = 0;
        while(current.next != null) {
            count++;
            if (count == index) {
                Node newNode = new Node(data);

                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.prepend(1);
        list.insertAtIndex(3, 4);

        list.print();
    }

}
