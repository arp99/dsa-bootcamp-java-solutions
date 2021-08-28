import java.util.Scanner;

/**
 * pattern5
 */
public class pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<(n - i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}