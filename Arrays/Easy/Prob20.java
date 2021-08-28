//  Determine Whether Matrix Can Be Obtained By Rotation
// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to 
// target by rotating mat in 90-degree increments, or false otherwise.

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int k = 4;
        while(k-- != 0){
            //rotate 90 deg and check if they are equal
            transpose(mat);
            reverse(mat);
            if(isMatEqual(mat , target))
                return true;
        }
        return false;
    }
    public static boolean isMatEqual(int[][] mat , int[][] target){
        int n = mat.length;
        for(int i = 0;i < n;i++){
            for(int j = 0; j < n ; j++){
                if( mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void transpose(int[][] mat){
        int n = mat.length;
        for(int i = 0; i< n;i ++ ){
            for(int j = i; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] mat){
        int n = mat.length;
        for(int i = 0;i<n;i++){
            int s = 0, e = n-1;
            while( s < e ){
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
                s++;
                e--;
            }
        }
    }
}
