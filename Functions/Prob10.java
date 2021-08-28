import java.util.Scanner;

// Write a function to find if a number if palindrome or not. Take number as parameter.

public class Prob10 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if(isPlaindrome(num))
            System.out.print("Number is palindrome");
        else
            System.out.print("Number is not palindrome");
        sc.close();
    }
    public static boolean isPlaindrome(int num) {
        int copyNum = num , num1 = 0;
        while(copyNum != 0){
            num1 = num1*10 + copyNum % 10;
            copyNum /= 10;
        }
        return num1 - num == 0;
    }
}
