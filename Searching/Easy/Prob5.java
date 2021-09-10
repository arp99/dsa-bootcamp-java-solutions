package Easy;
// Valid Perfect Square 
class Solution {
    public boolean isPerfectSquare(int num) {
        if( num == 1)
            return true;
        long s = 1, l = num/2;
        while( s <= l){
            long mid = l - (l-s)/2;
            if( mid * mid == num){
                return true;
            }
            else if( mid * mid > num){
                l = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return false;
    }
}