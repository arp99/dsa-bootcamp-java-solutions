import java.util.Scanner;

// Define a method to find out if number is prime or not.

public class Prob7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(isPrime(num))
            System.out.print("Prime");
        else
            System.out.print("Not prime");
        sc.close();        
    } 
    public static boolean isPrime(int num) {
        if(num <2)
            return false;
        for(int i = 2;i<= Math.sqrt(num);i++){
            if(num % i == 0)
                return false;
        }        
        return true;
    }
}
