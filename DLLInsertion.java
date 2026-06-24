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

public class DLLInsertion {

    DNode head;

    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

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

    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLLInsertion dll = new DLLInsertion();

        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.println("Doubly Linked List:");
        dll.display();
    }
}
