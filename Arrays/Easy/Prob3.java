// Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1;i < nums.length ;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
public class Prob3 {
    public static void main(String[] args) {
        // Enter Your Code Here
    } 
}
