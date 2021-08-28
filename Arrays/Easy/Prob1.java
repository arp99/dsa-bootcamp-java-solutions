// Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        //ans will be same length to nums
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length ;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

public class Prob1 {
    public static void main(String[] args) {
        // Enter Your Code Here
    }
}
