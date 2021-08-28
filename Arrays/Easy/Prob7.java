// Number of Good Pairs
// Given an array of integers nums.

// A pair (i,j) is called good if nums[i] == nums[j] and i < j.

// Return the number of good pair
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        //count frequency of numbers
        for(int num : nums){
            freq[num]++;
        }
        int count = 0;
        for(int f : freq){
            count+= noOfPairs(f);
        }
        return count;
     }
    public static int noOfPairs(int num){
        return (num*(num-1))/2;
    }
}
