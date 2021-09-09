// 1539. Kth Missing Positive Number
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Find the kth positive integer that is missing from this array.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missing = new ArrayList<>();
        int a = 1 , n = arr.length ;
        for(int i = 0; i < n ; ){
            if( arr[i] == a){
                i++;
                a++;
            }
            else{
                missing.add(a);
                a++;
            }
        }
        if(missing.size() < k){
            a = arr[n-1] + 1;
            int i = k;
            while(i-- != 0){
                missing.add(a);
                a++;
            }
        }
        return missing.get(k-1);
    }
}