package Collections;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("Hello");

        list.add(1, "Java");           // Insert at index 1
        list.set(1, "Programming");    // Replace element

        list.get(2);                   // Get element at index 2
        list.contains("java");         // Returns boolean

        list.add(null);

        // Using for loop
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Using enhanced for loop
        for(String s : list) {
            System.out.println(s);
        }

        // Iterator
        System.out.println("\nIterator");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(list);

        // ListIterator
        ListIterator<String> litr = list.listIterator();

        // Forward Traversal
        System.out.println("\nForward:");

        while(litr.hasNext()) {
            System.out.println(litr.next());
        }

        // Backward Traversal
        System.out.println("\nBackward:");

        while(litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}