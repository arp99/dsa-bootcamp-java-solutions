import java.util.Scanner;

// Take name as input and print a greeting message for that name.

public class Prob3 {
    // Enter Your Methods Here
    public static void main(String[] args) {
        // Enter Your Code Here
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Hello " + name);
        sc.close();
    }
}