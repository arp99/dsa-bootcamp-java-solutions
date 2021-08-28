import java.util.Scanner;

// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 123*....(n-1)n. E.g.- 4! = 1234 = 24 3! = 321 = 6 2! = 21 = 2 Also, 1! = 1 0! = 1

public class Prob9 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Factorial: " +  Factorial(num));
        sc.close();
    } 
    public static int Factorial(int num) {
        if(num == 0)
            return 1;
        return num * Factorial(num - 1); 
    }   
}
