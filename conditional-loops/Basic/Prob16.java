import java.util.Scanner;

// Volume Of Cylinder
public class Prob16 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int radius , height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        radius = sc.nextInt();
        height = sc.nextInt();
        System.out.print("\nVolume of cylinder: " + getVolume(radius , height));
        sc.close();
    }
    public static float getVolume(int radius , int height) {
        return (float)(3.14 * radius * radius * height);
    }
}
