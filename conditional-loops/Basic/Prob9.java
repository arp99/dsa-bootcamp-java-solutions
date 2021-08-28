import java.util.Scanner;

// Perimeter Of Equilateral Triangle
public class Prob9 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int side;
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        System.out.print("Perimeter of Equilateral triangle: " + getPerimeter(side));
        sc.close();
    }
    public static int getPerimeter(int side) {
        return 3*side;
    }
}
