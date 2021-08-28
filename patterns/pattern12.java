import java.util.Scanner;

/**
 * pattern11
 */
public class pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<2*(n - i) -1 ;k++){
                if( k % 2 != 0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k = 0;k<2*(i+1)-1;k++){
                if( k % 2 != 0){
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