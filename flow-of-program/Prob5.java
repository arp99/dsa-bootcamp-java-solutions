import java.util.Scanner;

// Keep taking numbers as input till user enters X and then print sum of them 
public class Prob5 {
    public static void main(String[] args) {
        int x = 2, num, sum=0;
        Scanner sc = new Scanner(System.in);
        do{
            num = sc.nextInt();
            sum += num;
        }while( num != x);
        sc.close();
        System.out.print("Sum: " + sum);
    }
}