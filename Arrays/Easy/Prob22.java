// Find N Unique Integers Sum up to Zero
// Given an integer n, return any array containing n unique integers such that they add up to 0.

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if( n % 2 != 0){
            result[n/2] = 0;
            for(int i = 0;i < (n/2);i++){
                result[i] = -1*(n - i);
            }
            int k = n;
            for(int i = (n/2)+1 ; i <n;i++){
                result[i] = k--;
            }
        }else{
            for(int i = 0; i< n/2;i++){
                result[i] = -1*(n-i);
            }
            int k = n;
            for(int i = n/2 ;i < n;i++){
                result[i] = k--;
            }
        }
        return result;
    }
}
