import java.util.Scanner;

// Volume Of Sphere

public class Prob17 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextInt();
        System.out.print("\nVolume of sphere: " + getVolume(radius));
        sc.close();
    } 
    public static float getVolume(int radius) {
        return (float)(4*3.14 * radius * radius * radius)/3;
    }
}
