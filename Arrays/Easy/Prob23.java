// Lucky Numbers in a Matrix
// Given a m * n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //find minimum and maximum in each column
        int m = matrix.length;
        int n = matrix[0].length;
        int[] minRow = new int[m];
        int[] maxCol = new int[n];
        for(int i = 0;i < m ;i++){
            int min = 100001;
            for(int j = 0; j < n; j++){
                min = matrix[i][j] < min ? matrix[i][j] : min;
            }
            minRow[i] = min;
        }
        for(int i = 0; i<n;i++){
            int max = -1;
            for(int j = 0; j< m ;j++){
                max = matrix[j][i] > max ? matrix[j][i] : max;
            }
            maxCol[i] = max;
        }
        
        for(int i = 0;i < m ;i++){
            for(int j = 0;j <n;j++){
                if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}