
// Find the Highest Altitude
// You are given an integer array gain of length n where gain[i] is the net gain in 
// altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0 , k = 1;
        int n = gain.length;
        int[] trip = new int[n+1];
        for(int i = 0;i<n;i++){
            trip[k] = trip[k-1] + gain[i];
            max = trip[k] > max ? trip[k] : max;
            k++;
        }
        return max;
    }
}