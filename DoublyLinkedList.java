package Doublelinkedlist;
class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    DNode head;
    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Insert at End
    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void displayForward() {
        DNode temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayBackward() {
        if (head == null) {
            return;
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);

        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        dll.displayForward();
        dll.displayBackward();
    }
}