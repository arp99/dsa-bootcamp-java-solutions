import java.util.Scanner;

// Take 2 numbers and find its HCM and LCM 
public class Prob4 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("H.C.F : " + getHCF(a,b));
        System.out.print("L.C.M : " + getLCM(a,b));
        sc.close();
    }
    public static int getHCF(int a , int b) {
        if(b == 0)
            return a;
        return getHCF(b , a % b);
    }
    public static int getLCM(int a , int b) {
        return ( a* b)/ getHCF(a, b);
    }
}   