// Recursive function to check wheter array is sorted or not

class Solution{
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        System.out.println(isSorted(arr, 4));
    }

    public static boolean isSorted(int[] arr, int n) {
        if( n < 2)
            return true;
        
        else if(arr[n-1] < arr[n-2])
            return false;
        
        return isSorted(arr , n-1);
    }
}