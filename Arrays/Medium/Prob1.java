// Spiral Matrix 
// Given an m x n matrix, return all elements of the matrix in spiral order.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        getSpiralMatrix(ans, matrix);
        return ans;
    }
    public static void getSpiralMatrix(List<Integer> ans , int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int top = 0 , bottom = m-1, right = n - 1 , left = 0;
        int move = 1;
        while( top <= bottom && left <= right ){
            if( move == 1){
                //move left-> right : top row
                for(int i = left ;i <= right ;i ++){
                    ans.add(mat[top][i]);
                }
                //top row done: increment it
                top++;
                move++;
            }
            else if( move == 2){
                //move top->bottom : right column
                for(int i = top ;i <= bottom ; i++){
                    ans.add(mat[i][right]);
                }
                //right most column done: decrement it
                right--;
                move++;
            }
            else if( move == 3){
                // move right -> left : bottom row
                for(int i = right;i >= left ; i--){
                    ans.add(mat[bottom][i]);
                }
                //bottom row done : decrement it
                bottom--;
                move++;
            }
            else if( move == 4){
                //move bottom -> top : left column
                for(int i = bottom ;i >= top;i--){
                    ans.add(mat[i][left]);
                }
                //left column is done : increment it
                left++;
                move = 1;
            }
        }
    }
}