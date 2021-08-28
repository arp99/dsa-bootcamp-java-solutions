import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class Prob6 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print(getMax(a,b));
        sc.close();
    }    
    public static int getMax(int a , int b) {
        return a > b ? a : b;
    }
}
