package Collections;
import java.util.*;
public class vectordemo {
	public static void main(String[]args) {
		Vector<Integer> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()) {
        	System.out.println(e.nextElement());
        }
		
	}

}
