// Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1 , - 1};
        
        int left = binSearch(nums , target , true);
        int right = binSearch(nums , target , false);
        ans[0] = left;
        ans[1] = right;
        
        return ans;
    }
    public static int binSearch(int[] nums , int target , boolean leftIndex){
        int mid , ans = - 1 , n = nums.length;
        int l = 0, r = n - 1;
        
        while( l <= r){
            mid = r - (r - l) /2;
            if(nums[mid] == target){
                ans = mid;
                if(leftIndex){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else if( nums[mid] < target ){
                l = mid + 1;
            }
        }
        
        return ans;
    }
}