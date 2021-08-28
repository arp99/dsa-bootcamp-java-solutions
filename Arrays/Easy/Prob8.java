// How Many Numbers Are Smaller Than the Current Number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int temp, count = 0;
        int[] result = new int[nums.length];
        for(int i = 0; count< nums.length ;i++){
            if(freq[i] != 0){//if element present
                temp = freq[i];
                freq[i] = count;
                count += temp;
            }
        }
        for(int i = 0; i< nums.length;i++){
            result[i] = freq[nums[i]];
        }
        return result;
    }
}
