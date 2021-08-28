import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.

public class Prob5 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.print(Product(num1 , num2));
        sc.close();
    } 
    public static int Product(int num1 , int num2) {
        return num1 * num2;
    } 
}
