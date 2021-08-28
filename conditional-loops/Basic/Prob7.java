import java.util.Scanner;
import java.math.*;
// Area Of Equilateral Triangle
public class Prob7 {
    public static void main(String[] args) {
        int side;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle: ");
        side = sc.nextInt();
        System.out.print("\nArea of Equilateral triangle: " + getArea(side));
        sc.close();
    }
    public static float getArea(int side) {
        return (float)((Math.sqrt(3)*side*side)/4);
    }
}
