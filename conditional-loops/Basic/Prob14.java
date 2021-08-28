import java.util.Scanner;

// Volume Of Cone Java Program
public class Prob14 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int radius , height;
        System.out.print("Enter radius and height: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        height = sc.nextInt();
        System.out.print("\nVolume of cone: " + getVolume(radius , height));
        sc.close();
    }
    public static float getVolume(int radius , int height) {
        return (float)(3.14 * radius * radius * height /3);
    }
}
