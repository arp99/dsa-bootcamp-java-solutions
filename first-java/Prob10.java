import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.
public class Prob10 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            num = sc.nextInt();
            max = num > max?num:max;
        }while(num != 0);
        System.out.print("Max value: " + max);
        sc.close();
    }
}
