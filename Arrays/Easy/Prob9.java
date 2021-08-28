
// Create Target Array in the Given Order
// Given two arrays of integers nums and index. Your task is to create target array under the following rules:

// Initially target array is empty.
// From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
// Repeat the previous step until there are no elements to read in nums and index.

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        Arrays.fill(target,-1);
        for(int i = 0;i < n;i++){
            if(target[index[i]] == -1){
                target[index[i]] = nums[i]; 
            }else{
                //shift target elements to right
                for(int j = n -1; j > index[i] ;j--){
                    target[j] = target[j-1];
                }
                //now insert element
                target[index[i]] = nums[i];
            }
        }
        return target;
    }
}
