import java.util.Scanner;

// Fibonacci Series In Java Programs

public class Prob21 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    } 
    public static void printFibonacci(int n) {
        int first = 0 , second = 1, curr;
        for(int i = 0;i<n;i++){
            if(i == 0){
                System.out.print(first + " ");
            }
            else if(i == 1){
                System.out.print(second + " ");
            }else{
                curr = first + second;
                System.out.print(curr + " ");
                first = second;
                second = curr;
            }
        }
    }
}
