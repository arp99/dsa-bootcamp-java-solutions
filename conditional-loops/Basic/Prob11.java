import java.util.Scanner;

// Perimeter Of Rectangle
public class Prob11 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int l , w;
        System.out.print("Enter length and width: ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        w = sc.nextInt();
        System.out.print("Perimeter of rectnagle: " + getPerimeter(l ,w));
        sc.close();
    }
    public static int getPerimeter(int length , int width) {
        return ( 2 *( length + width ));        
    }
}
