import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        // Enter Your Code Here
        int[] arr = {0,99,23,44,2,4,78,1};
        bubbleSort(arr , arr.length);
        System.out.print(Arrays.toString(arr));
    }
    //need 2 recurse function for 2 nested loop or else only one recursal or one iteration
    static void bubbleSort(int[] arr , int n){
        if(n == 1)
            return;
        //move largest to last
        swap(arr,0,n);
        //reduce array size and sort rest
        bubbleSort(arr, n - 1); // outer loop in bubble sort
    }
    
    static void swap(int[] arr, int l , int n){
        if( l == n-1)
            return;
        if( arr[l] > arr[l+1]){
            int temp = arr[l];
            arr[l] = arr[l+1];
            arr[l+1] = temp;
        }
        swap(arr , l+1,n);
    }
}