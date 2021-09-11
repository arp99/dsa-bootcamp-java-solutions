// Search in Rotated Sorted Array II
class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while( s <= e ){
            int mid = e - ( e - s )/2;
            if( nums[mid] == target || nums[s] == target || nums[e] == target)
                return true;
            
            if( nums[s] == nums[mid] || nums[mid] == nums[e] ){
                if( target < nums[mid] )
                    e--;
                else
                    s++;
            }
            else if( nums[s] < nums[mid]){
                if( target > nums[s] && target < nums[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            }
            else if ( nums[mid] < nums[e] ){
                if( target > nums[mid] && target < nums[e] )
                    s = mid + 1;
                else
                    e = mid - 1;
            }
        }
        return false;
    }
}