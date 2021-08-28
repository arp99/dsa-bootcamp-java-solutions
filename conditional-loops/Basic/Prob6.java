import java.util.Scanner;

// Area Of Rhombus
public class Prob6 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int p , q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of 2 diagonal: ");
        p = sc.nextInt();
        q = sc.nextInt();
        System.out.print("\nArea of rhombus: "  + getArea(p,q));
        sc.close();
    }
    public static float getArea(int diag1 , int diag2) {
        return (float)( 0.5 * diag1 * diag2);
    }
}
