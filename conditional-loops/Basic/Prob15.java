import java.util.Scanner;

// Volume Of Prism
public class Prob15 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int base , height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        base = sc.nextInt();
        height = sc.nextInt();
        System.out.print("\nVolume of prism: " + getVolume(base , height));
        sc.close();
    }
    public static int getVolume(int base , int height) {
        return base * height;
    }
}
