// 1901. Find a Peak Element II

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m; i++){
            //binary search on each row
            int start = 0, end = n - 1;
            while( start <= end){
                int mid = (start + end )/2;
                int curr = mat[i][mid];
                int top = i == 0 ? - 1 : mat[i-1][mid];
                int bottom = i == m-1 ? -1 : mat[i+1][mid];
                int left = mid == 0 ? - 1 : mat[i][mid-1];
                int right = mid == n-1 ? -1 : mat[i][mid+1];
                
                if( curr > top && curr > bottom && curr > left && curr > right ){
                    return new int[]{ i, mid };
                }
                else if( curr < right )
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}