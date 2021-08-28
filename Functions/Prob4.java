import java.util.Scanner;

// Write a program to print the sum of two numbers entered by user by defining your own method.

public class Prob4 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.print(Sum(num1 , num2));
        sc.close();
    } 
   public static int Sum(int num1 , int num2) {
       return num1 + num2;
   }
}
