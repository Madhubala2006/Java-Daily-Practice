package Doublelinkedlist;
class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class DLLInsertAtPosition {

    DNode head;

    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    int countNode() {
        int count = 0;
        DNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtPosition(int pos, int data) {

        DNode newNode = new DNode(data);

        if (pos == 1) {
            newNode.next = head;

            if (head != null)
                head.prev = newNode;

            head = newNode;
            return;
        }

        DNode temp = head;

        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DLLInsertAtPosition obj = new DLLInsertAtPosition();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);

        obj.insertAtPosition(2, 15);

        obj.display();
    }
}