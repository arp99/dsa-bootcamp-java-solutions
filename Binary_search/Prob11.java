// Count Negative Numbers in a Sorted Matrix
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, 
// return the number of negative numbers in grid.

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i< m ;i++){
            int s = 0, e = n - 1;
            int idx = -1;
            while( s<= e){
                int mid = e - ( e - s)/2;
                if( grid[i][mid] >= 0){
                    s = mid + 1;
                }
                else if( grid[i][mid] < 0){
                    idx = mid;
                    e = mid - 1;
                }
            }
            if(idx >= 0)
                count += (n - idx);
        }
        return count;
    }
}