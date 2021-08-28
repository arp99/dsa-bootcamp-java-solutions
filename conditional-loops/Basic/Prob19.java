import java.util.Scanner;

// Curved Surface Area Of Cylinder

public class Prob19 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int r, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        r = sc.nextInt();
        h = sc.nextInt();
        System.out.print("\nCurved surface area of cylinder: " + getCurvedArea(r , h));
        sc.close();
    } 
    public static float getCurvedArea(int radius , int height) {
        return (float)(2 * 3.14 * radius * height);
    }
}
