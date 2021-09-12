// Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, col = m - 1;
        
        while( row < n && col >= 0){
            if( matrix[row][col] == target )
                return true;
            else if( target > matrix[row][col] )
                row++;
            else if( target < matrix[row][col] )
                col--;
        }
        return false;
    }
}