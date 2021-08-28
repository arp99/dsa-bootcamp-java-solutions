import java.util.Scanner;

// Input a number and print its multiplication table 

public class Prob3 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       printTable(num); 
       sc.close();
    }
    public static void printTable(int num) {
        for(int i = 1;i<=10 ;i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}