import java.util.Scanner;

// Perimeter Of Circle
public class Prob8 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int r;
        System.out.print("Enter value of radius: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.print("\nPermieter of circle: " + getCircumference(r));
        sc.close();
    }
    public static float getCircumference(int radius) {
        return (float)( 2 * 3.14 * radius );
    }
}
