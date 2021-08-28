import java.util.Scanner;

/**
 * pattern14
 */
public class pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            int numStars = 2*(n - i) -1;
            for(int k = 0;k<numStars ;k++){
                if( i > 0 && k > 0 && k < numStars - 1){
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