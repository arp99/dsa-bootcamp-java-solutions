import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class Prob6 {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.print("Area: " + area(r));
        System.out.print("\nCircumference: " + circumference(r));
        sc.close();
    } 
    public static float area(int radius) {
        return (float)(3.14 * radius * radius);
    }
    public static float circumference(int radius) {
        return (float)(2 * 3.14 * radius);
    }
}
