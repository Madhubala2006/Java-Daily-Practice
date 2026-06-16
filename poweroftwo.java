package practice;
import java.util.*;
public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 1 && n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
    }
}