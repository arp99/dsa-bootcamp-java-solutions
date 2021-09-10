// Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int n  = nums.length;
        if( n == 1 )
            return nums[0] == target ? 0 : -1;
        int s = 0, e = n - 1;
        while(s<=e){
            int mid = e - ( e - s)/2;
            if( nums[mid] == target)
                return mid;
            else if( nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            }
            else if(nums[mid] <= nums[e]){
                if(target > nums[mid] && target <= nums[e])
                    s = mid + 1;
                else
                    e = mid - 1;
            }
        }
        return -1;
    } 
}