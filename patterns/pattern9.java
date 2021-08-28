import java.util.Scanner;

/**
 * pattern9
 */
public class pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<2*(n - i) -1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}