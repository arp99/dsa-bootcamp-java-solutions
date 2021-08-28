// Flipping an Image
// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0;i < n ;i++){
            int s = 0 , e = n-1;
            while(s < e){
                int temp = image[i][s];
                image[i][s] = image[i][e];
                image[i][e] = temp;
                s++;
                e--;
            }
            for(int j = 0; j< n;j++){
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return image;
        
    }
}
