// Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1 , sum  = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i = 0;i< m ; i++){
            sum = 0;
            for(int j = 0;j< n ;j++){
                sum += accounts[i][j];
            }
            max = sum > max ? sum : max;
        }
        return max;
    }
}
public class Prob4 {
    public static void main(String[] args) {
        // Enter Your Code Here
    }    
}
