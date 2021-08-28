import java.util.Scanner;

// Volume Of Pyramid

public class Prob18 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int l,w,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length, base width and height: ");
        l = sc.nextInt();  
        w = sc.nextInt();  
        h = sc.nextInt();  
        System.out.print("\nVolume of pyramid: " + getVolume(l,w,h));
        sc.close();
    } 
    public static float getVolume(int l , int w , int h) {
        return (float)(l*w*h)/3;
    }
}
