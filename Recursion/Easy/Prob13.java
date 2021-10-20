class Solution {
    public boolean isPowerOfTwo(int n) {
        return helper(n,0);
    }
    static boolean helper(int n, int power){
        if( Math.pow(2,power) > n)
            return false;
        else if( Math.pow(2,power) == n )
            return true;
        
        return helper( n, power + 1);
    }
}