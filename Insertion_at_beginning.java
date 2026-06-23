package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion_at_beginning {

    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void display() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Insertion_at_beginning list = new Insertion_at_beginning();

        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);

        list.display();
    }
}