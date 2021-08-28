import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input.
public class Prob2 {
    // Enter Your Methods Here
    public static void main(String[] args) {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
        sc.close();
    }
    static boolean isEven(int num) {
        return num % 2 == 0;        
    }
}