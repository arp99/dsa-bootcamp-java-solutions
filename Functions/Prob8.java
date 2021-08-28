import java.util.Scanner;

// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail

public class Prob8 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
        System.out.print(getGrades(marks));
        sc.close();
    }    
    public static String getGrades(int marks) {
        if(marks > 90 && marks <= 100)
            return "AA";
        else if(marks > 80 && marks <= 90)
            return "AB";
        else if( marks>70 && marks <= 80 )
            return "BB";
        else if(marks > 60 && marks <=70)
            return "BC";
        else if(marks >50 && marks <= 60)
            return "CD";
        else if(marks >40 && marks <= 50)
            return "DD";
        return "Fail";
    }
}
