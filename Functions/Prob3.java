import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class Prob3 {
    public static void main(String[] args) {
        // Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();
        if(isElegible(age))
            System.out.print("You are eligible to vote");  
        else
            System.out.print("Your are ineligible to vote");
        sc.close();
    }
    public static boolean isElegible(int age) {
        return age >= 18;
    } 
}
