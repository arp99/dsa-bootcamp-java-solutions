import java.util.Scanner;

// Area Of Parallelogram
public class Prob5 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int b , h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        System.out.print("Area of parallelogram: "  + getArea(b , h));
        sc.close();
    }
    public static int getArea(int base , int height) {
        return base * height;
    }
}
