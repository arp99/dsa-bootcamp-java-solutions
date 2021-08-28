import java.util.Scanner;

/**
 * pattern16
 */
public class pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        int inner = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            int numCells = 2*(i+1)-1;
            inner = i;
            for(int k = 0;k<numCells;k++){
                if( k % 2 != 0 ){
                    System.out.print(" ");
                    if( k > 1 && k< numCells/2){
                        inner+=2;
                    }
                    else if( k > 1 && k>=numCells/2){
                        inner-=2;
                    }
                }else if( k >0 && k <numCells-1){
                    System.out.print(inner);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}