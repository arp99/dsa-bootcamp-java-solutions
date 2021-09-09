// Intersection of Two Arrays II
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many 
// times as it shows in both arrays and you may return the result in any order.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq1 = new int[1001];
        int[] freq2 = new int[1001];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : nums1){
            freq1[i]++;
        }
        for(int j : nums2){
            freq2[j]++;
        }
        for(int i : nums1){
            
            if( freq1[i] > 0 && freq2[i] > 0){
                list.add(i);
                freq1[i]--;
                freq2[i]--;
            }
        }
        int[] result = new int[list.size()];
        for(int k = 0; k < list.size();k++){
            result[k] = list.get(k);
        }
        return result;
    }
}