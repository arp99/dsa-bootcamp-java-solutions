import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Prob9 {
    public static void main(String[] args) {
        int sum = 0, num;
        Scanner sc = new Scanner(System.in);
        do{
            num = sc.nextInt();
            sum += num;
        }while( num != 0);
        System.out.print("Sum: " +  sum);
        sc.close();
    }
}
