import java.util.Scanner;

/**
 * pattern15
 */
public class pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            int numStars = 2*(i+1) -1;
            for(int k = 0;k<numStars;k++){
                if(k > 0 && k<numStars - 1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            int numStars = 2*(n - i) -1;
            for(int k = 0;k<numStars ;k++){
                if( k > 0 && k < numStars - 1){
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