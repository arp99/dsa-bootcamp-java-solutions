import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Prob5 {
    public static void main(String[] args) {
        // Enter Your Code Here
        int a , b;
        char operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 nos:\n");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter operator: ");
        operator = sc.next().trim().charAt(0);

        System.out.print(getResult(a,b,operator));
        sc.close();
    }    
    public static int getResult(int a , int b , char operator) {
        if(operator == '+')
            return a + b;
        else if( operator == '-')
            return a - b;
        else if( operator == '*')
            return a * b;
        else if( operator == '/')
            return a /b;
        return -1;
    }
}
