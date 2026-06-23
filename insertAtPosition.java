package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertAtPosition {

    Node head;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void insertAtPosition(int pos, int data) {

        if (pos < 1) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        insertAtPosition list = new insertAtPosition();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Before Insertion:");
        list.display();

        list.insertAtPosition(3, 25);

        System.out.println("After Insertion:");
        list.display();
    }
}