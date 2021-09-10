package Easy;
// Intersection of Two Arrays 
// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must be unique and you may return the result in any order.

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int k = 0;
        boolean[] present = new boolean[1001];
        Arrays.sort(nums2);
        
        for(int i = 0;i<nums1.length; i++){
           int search = binSearch(nums2, nums1[i]);
            
            if( search != -1 && !present[nums1[i]]) 
                list.add(search);
            
            present[ nums1[i] ] = true;
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
    static int binSearch(int[] nums, int target){
        int s = 0, e = nums.length - 1;
        while( s<= e){
            int mid = e - ( e - s)/2;
            if(nums[mid] == target)
                return nums[mid];
            else if( nums[mid] > target )
                e = mid - 1;
            else if( nums[mid] < target )
                s = mid + 1;
        }
        return -1;
    }
}