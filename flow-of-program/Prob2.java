import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(sum(a,b));
        sc.close();
    }
    public static int sum(int a , int b) {
        return a + b;
    }
}