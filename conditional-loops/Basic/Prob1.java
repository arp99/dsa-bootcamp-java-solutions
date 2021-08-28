// Area Of Circle Java Program
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of circle: " + getArea(r));
        sc.close();
    }
    public static float getArea(int radius){
        return (float)(3.14 * radius * radius);
    }
}
