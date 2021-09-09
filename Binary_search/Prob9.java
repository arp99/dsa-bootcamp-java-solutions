// Search Insert Position
// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while( s <= e){
            int mid = e - (e - s)/2;
            
            if( nums[mid] == target)
                    return mid;
            else if(nums[mid] > target)
                e = mid - 1;
            else if(nums[mid] < target)
                s = mid + 1;
        }
        return s;
    }
}