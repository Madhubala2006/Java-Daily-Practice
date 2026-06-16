package practice;
import java.util.*;
public class poweroffour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 1 && n % 4 == 0) {
            n = n / 4;
        }

        if (n == 1)
            System.out.println("Power of 4");
        else
            System.out.println("Not Power of 4");
    }
}