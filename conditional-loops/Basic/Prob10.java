import java.util.Scanner;

// Perimeter Of Parallelogram
public class Prob10 {
    public static void main(String[] args) {
        int base , side;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and side of parallelogram: ");
        base = sc.nextInt();
        side = sc.nextInt();
        System.out.print("\nPerimeter of parallelogram: " + getPerimeter(base , side));
        sc.close();
    }
    public static int getPerimeter(int base , int side) {
        return 2*(base + side);
    }
}
