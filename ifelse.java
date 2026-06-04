import java.lang.System;
import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        boolean summer = false;
        if(summer){
            System.out.println("Wear Coat");
        }
        else{
            System.out.println("Enjoy your icecream");
        }
        //comparator operator
        System.out.println(58>90);
        //Example practice(Check equal or not  )
        int num1 = 40;
        int num2 = 50;
        if(num1==num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        //user input for comparsion
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("Both numbers are not equal");
        }
    }
}
