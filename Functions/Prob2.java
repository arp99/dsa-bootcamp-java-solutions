import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.

public class Prob2 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(isEven(num))
            System.out.print("Even");
        else
            System.out.print("Odd");
        sc.close();    
    } 
    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }
}
