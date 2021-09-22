// Sum of digits of a number using recursion 
class Solution{
    public static void main(String[] args) {
        // Enter Your Code Here
        int n = 12345;
        int sum = sumOfDigits(n);
        System.out.print("Sum of digits: " + sum);
    }
    static int sumOfDigits(int n){
        if(n < 10)
            return n;
        return (n % 10) + sumOfDigits( n / 10);
    }
}