import java.util.Scanner;

/**
 * pattern6
 */
public class pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(j < (n - 1 - i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}