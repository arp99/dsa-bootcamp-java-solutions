// Two Sum 
// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer , Integer> visited = new HashMap<>();
        
        int diff , n = nums.length;
        for(int i = 0; i< n ; i++){
            diff = target - nums[i];
            //now check if the diff has already occured in the array
            if(visited.containsKey(diff)){
                indices[0] = visited.get(diff);
                indices[1] = i;
            }
            else{
                //make the curr element visited and store its index
                visited.put(nums[i] , i);
            }
        }
        return indices;
    }
}