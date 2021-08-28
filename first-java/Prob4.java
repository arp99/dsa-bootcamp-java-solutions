import java.util.Scanner;

// Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
public class Prob4 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int p,r,t;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        r = sc.nextInt();
        t = sc.nextInt();
        System.out.print("Simple Interest: " + getSimpleInterest(p,r,t));
        sc.close();        
    }    
    public static float getSimpleInterest(int p , int r , int t) {
        return (float)( p * r * t)/ 100;
    }
}
