import java.util.HashMap;

// Set Matrix Zeroes 
// Given an m x n integer matrix matrix, if an element is 0, 
// set its entire row and column to 0's, and return the matrix.
// You must do it in place.

class Solution {

    public void setZeroes(int[][] mat) {
        int m = mat.length , n = mat[0].length;
        HashMap<Integer , Boolean > rows = new HashMap<>();
        HashMap<Integer , Boolean > cols = new HashMap<>();

        for(int i = 0; i< m; i++){
            for(int j = 0; j< n;j++){
                if( mat[i][j] == 0 ){
                    if( !rows.containsKey(i) ){
                        rows.put(i, true);
                    }
                    if( !cols.containsKey(j) ){
                        cols.put(j, true);
                    }
                }
            }
        }
        //now set the respective rows and columns as 0
        for(int i = 0; i< m ;i++){
            for(int j = 0;j < n ;j++){
                //if row present in rows
                if(rows.containsKey(i)){
                    mat[i][j] = 0;
                }
                if( !rows.containsKey(i) && cols.containsKey(j)){
                    mat[i][j] = 0;
                }
            }
        }    
    }
    
}
// T. C : O(n^2)
// S. C : O( m + n)