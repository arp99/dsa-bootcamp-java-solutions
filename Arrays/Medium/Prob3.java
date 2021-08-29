// Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] 
//is equal to the product of all the elements of nums except nums[i].

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n  = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans , 1);
        int p = 1 ;
        //product of left elements
        for(int i = 0;i <n;i++){
            ans[i] *= p;
            p *= nums[i];
        }
        p = 1;
        //product of right elements
        for(int i = n - 1; i>= 0 ;i--){
            ans[i] *= p;
            p *= nums[i];
        }
        return ans;
    }
}