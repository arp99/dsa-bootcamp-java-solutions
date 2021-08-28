// Matrix Diagonal Sum
// iven a square matrix mat, return the sum of the matrix diagonals.
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0, k = n-1 ; i<n ; i++ , k--){
            if(i != k){
                sum+= mat[i][i] + mat[i][k];
            }else{
                sum+= mat[i][i];
            }
        }
        return sum;
    }
}