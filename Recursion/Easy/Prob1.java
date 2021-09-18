class Solution{

    public static void printTriangle(int[] arr , int len){

        if( len < 1)
            return;
        int[] newArr = getSumArray(arr);
        printTriangle(newArr, len - 1);
        printArray(arr, len);
    }

    static void printArray(int[] arr, int len){
        
        System.out.print("[");
        for(int i = 0; i< len-1;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[len - 1] + "]");
        System.out.println();
    }
    
    static int[] getSumArray(int[] arr){

        int n = arr.length;
        int[] temp = new int[n-1];
        for(int i = 0; i<n-1;i++){
            temp[i] = arr[i] + arr[i+1];
        }
        return temp;
    }
}