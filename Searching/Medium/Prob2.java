// Single Element in a Sorted Array
// You are given a sorted array consisting of only integers where every element appears exactly twice, 
// except for one element which appears exactly once. Find this single element that appears only once.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0, e = n-1;
        //if one element is there that is the result
        if( n == 1)
            return nums[0];
        else if ( nums[0] != nums[1]){
            return nums[0];
        }
        else if(nums[n-1] != nums[n-2])
                return nums[n-1];
        
        while( s<= e){
            int mid = e - ( e - s )/2;
            if( nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1] )
                return nums[mid];
            else{
                if( mid % 2 == 0){
                    if( nums[mid - 1] == nums[mid] )
                        e = mid - 2;
                    else
                        s = mid + 2;
                }
                else{
                    if( nums[mid - 1] == nums[mid] )
                        s = mid + 1;
                    else
                        e = mid - 1;
                }
            }
        }
        return -1;
    }
}