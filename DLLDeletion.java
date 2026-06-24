package Doublelinkedlist;

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DLLDeletion {

    DNode head;

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

    // Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Delete at End
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Display
    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DLLDeletion dll = new DLLDeletion();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Original List:");
        dll.display();

        dll.deleteAtBeginning();
        System.out.println("After Delete At Beginning:");
        dll.display();

        dll.deleteAtEnd();
        System.out.println("After Delete At End:");
        dll.display();
    }
}