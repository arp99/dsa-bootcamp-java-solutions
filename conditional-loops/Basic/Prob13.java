import java.util.Scanner;

// Perimeter Of Rhombus
public class Prob13 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int side;
        System.out.print("Enter side : ");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        System.out.print("Perimeter of rhomus: " + getPerimeter(side));
        sc.close();
    }
    public static int getPerimeter(int side) {
        return ( 4 * side );        
    }
}
