package Doublelinkedlist;
class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class DLLDeleteByPosition {

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

    void deleteByPos(int pos) {

        if (pos == 1) {
            head = head.next;

            if (head != null)
                head.prev = null;

            return;
        }

        DNode temp = head;

        for (int i = 1; i < pos; i++)
            temp = temp.next;

        temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    void display() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DLLDeleteByPosition obj = new DLLDeleteByPosition();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);

        obj.deleteByPos(3);

        obj.display();
    }
}