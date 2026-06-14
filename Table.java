package Synchronization;

class MultiplicationTable {

    synchronized void printTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class TableThread extends Thread {

    MultiplicationTable t;

    TableThread(MultiplicationTable t) {
        this.t = t;
    }

    public void run() {
        t.printTable(2);
    }
}

class TableThread2 extends Thread {

    MultiplicationTable t;

    TableThread2(MultiplicationTable t) {
        this.t = t;
    }

    public void run() {
        t.printTable(4);
    }
}

public class Table {

    public static void main(String[] args) {

        MultiplicationTable obj = new MultiplicationTable();

        TableThread t1 = new TableThread(obj);
        TableThread2 t2 = new TableThread2(obj);

        t1.start();
        t2.start();
    }
}