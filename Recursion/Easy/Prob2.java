class Solution{

    static int minElement(int[] arr, int len){
        if( len == 1)
            return arr[len - 1];
        
        int restMin = minElement(arr, len - 1);
        return arr[len - 1] < restMin ? arr[len - 1] : restMin;
    }
    static int maxElement(int[] arr, int len){
        if( len == 1)
            return arr[len - 1];
        
        int restMax = maxElement(arr, len - 1);
        return arr[len - 1] > restMax ? arr[len - 1] : restMax;
    }
}