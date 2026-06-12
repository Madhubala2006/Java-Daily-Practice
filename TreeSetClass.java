//Print duplicate elements in array using treeset
package practice;
import java.util.TreeSet;
public class TreeSetClass {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5,6};
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			t.add(arr[i]);
		}
		System.out.println(t);

	}

}
