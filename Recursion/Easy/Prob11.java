//Check prime number recursively
class Solution {
    public static void main(String[] args) {
        // Enter Your Code Here
        boolean check = isPrime(6, 2);
        System.out.print(check);
    }

    static boolean isPrime(int n , int i){
        
        if( n<= 2)
            return ( n == 2) ? true : false;
        if( n % i == 0)
            return false;
        if(i*i > n)
            return true;
        return isPrime(n, i+1);
    }
}