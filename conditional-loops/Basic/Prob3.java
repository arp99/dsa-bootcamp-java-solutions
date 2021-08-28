import java.util.Scanner;

// Area Of Rectangle Program
public class Prob3 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int l,b;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Area of rectangle: " + getArea(l,b));
        sc.close();
    }
    public static int getArea(int length , int breadth) {
        return length * breadth;
    }
}
