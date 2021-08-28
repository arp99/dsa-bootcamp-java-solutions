// Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0, j = n ,k = 0;
        while( i < n){
            ans[k++] = nums[i++];
            ans[k++] = nums[j++];
        }
        return ans;
    }
}
public class Prob5 {
    public static void main(String[] args) {
        // Enter Your Code Here
    } 
}
