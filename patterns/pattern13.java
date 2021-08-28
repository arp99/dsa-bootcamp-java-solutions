import java.util.Scanner;

/**
 * pattern8
 */
public class pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            int numStars = 2*(i+1) -1;
            for(int k = 0;k<numStars;k++){
                if( i<(n-1) && k > 0 && k<numStars - 1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}