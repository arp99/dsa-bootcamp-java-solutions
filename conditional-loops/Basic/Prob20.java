import java.util.Scanner;

// Total Surface Area Of Cube

public class Prob20 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int side;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube");
        side = sc.nextInt();
        System.out.print("\nSurface area of cube: " + getArea(side));
        sc.close();  
    } 
    public static int getArea(int side) {
        return 6 * side * side ;
    }
}
