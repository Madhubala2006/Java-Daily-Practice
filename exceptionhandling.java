package Exceptions;
import java.util.*;
public class exceptionhandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	try {
		int c = a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Finally block");
	}
}
}
