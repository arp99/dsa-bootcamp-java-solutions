import java.util.Scanner;

//input a year and find if it is a leap year or not
public class Prob1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.print("Leap year");
        }else{
            System.out.print("Not Leap year");
        }
    }
    static boolean isLeapYear(int year) {
        if( year % 4 == 0){
            if(year % 400 == 0){
                return true;
            }else if( year % 100 == 0){
                return false;
            }
        }
        return false;    
    }
}