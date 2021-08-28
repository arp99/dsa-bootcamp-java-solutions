import java.util.Scanner;

// Input a number and print all the factors of that number (use loops).

public class Prob7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Factors of " + num + " are : ");
        for(int i = 1;i<=num;i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }    
}
