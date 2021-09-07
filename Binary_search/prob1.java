/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, 
and only the integer part of the result is returned.
*/

class Solution {
    public int mySqrt(int x) {
        if( x <= 1)
            return x;
        long max = 1, s = 1, l = x/2;
        while( s <= l ){
            long mid = l - (l - s)/2;
            if( (mid * mid) == x){
                return (int)mid;
            }
            else if( (mid * mid) < x ){
                max = mid > max ? mid : max;
                s = mid + 1;
            }
            else if( (mid * mid) > x){
                l = mid - 1;
            }
        }
        return (int)max;
    }
}