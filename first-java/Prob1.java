import java.util.Scanner;

// Write a program to print factorial of a number, also take input.
public class Prob1 {
    // Enter Your Methods Here
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print(fact(num));
        sc.close();
    }
    public static int fact(int num) {
        if( num == 0)
            return 1;
        return num * fact(num-1);
    }
}