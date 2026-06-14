package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class HashSetClass {

	public static void main(String[] args) {
		//HashSet<Integer> s = new HashSet<Integer>(); //unordered
		//LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(); //maintains insertion
		TreeSet<Integer> s = new TreeSet<Integer>(); //sorted order
		s.add(15);
		s.add(200);
		s.add(2);
		s.add(4);
		s.add(2);
		s.add(null);
		s.add(null);
		System.out.println(s);
		
	}

}
