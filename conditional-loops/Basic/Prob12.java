import java.util.Scanner;

// Perimeter Of Square
public class Prob12 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int side;
        System.out.print("Enter side : ");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        System.out.print("Perimeter of square: " + getPerimeter(side));
        sc.close();
    }
    public static int getPerimeter(int side) {
        return ( 4 * side );        
    }
}
