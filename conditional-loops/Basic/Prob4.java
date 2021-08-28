import java.util.Scanner;

// Area Of Isosceles Triangle

public class Prob4 {
    public static void main(String[] args) {
        int b,h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        System.out.print("Area of isosceles triangle: "  + getArea(b,h));
        sc.close();
    }
    public static float getArea(int base , int height) {
        return (float)( 0.5 * base * height);
    }
}
