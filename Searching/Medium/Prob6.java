// Peak Index in a Mountain Array 
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int peak = 0;
        
        if ( n == 1) return 0;
        else if ( n == 2) return nums[0] > nums[1] ? 0 : 1;
        
        while( start <= end ){
            int mid = end - ( end - start )/2;
            
            if(mid == 0 && nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if( mid == n - 1 && nums[mid] > nums[mid - 1])
                return mid;
            
            else if( nums[mid] > nums[mid -1] && nums[mid] > nums[mid+1]){
                peak = mid;
                break;
            }
            else if( nums[mid - 1] > nums[mid] )
                end = mid - 1;
            else if( nums[mid + 1] > nums[mid] )
                start = mid + 1;
        }
        return peak;
    }
}