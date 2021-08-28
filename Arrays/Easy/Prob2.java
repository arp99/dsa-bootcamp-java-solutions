// Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i = 0;i <n;i++){
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}

public class Prob2 {
    public static void main(String[] args) {
        
    }
}
