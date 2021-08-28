import java.util.Scanner;

/**
 * pattern7
 */
public class pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j <n;j++){
                if(j < i){
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