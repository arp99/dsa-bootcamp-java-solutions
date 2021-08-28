import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
public class Prob1 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int a, b,c;
        System.out.print("Enter 3 nums: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.print("Max of 3 nums: " + Max(a,b,c));
        System.out.print("\nMin of 3 nums: " + Min(a,b,c));
        sc.close();
    }
    public static int Max(int a , int b , int c) {
        int max = a;
        if( b > max)
            max = b;
        if( c  > max)
            max = c;
        
        return max;
    }
    public static int Min(int a , int b , int c) {
        int min = a;
        if( b < min)
            min = b;
        if( c  < min)
            min = c;
        return min;
    }
}
