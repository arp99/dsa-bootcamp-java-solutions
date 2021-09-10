// 1608. Special Array With X Elements Greater Than or Equal X
class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int i = n - 1, j = n;
        Arrays.sort(nums);
        while( i>=0 ){
            if( nums[i] >= j ){
                freq[j]++;
                i--;
            }else{
                j--;
                freq[j] += freq[j+1];
            }
        }
        for(i = 1;i <= n;i++){
            if( i == freq[i] )
                return i;
        }
        return -1;
    }
}