// 888. Fair Candy Swap
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int candy : aliceSizes)
            sumA += candy;
        
        for(int candy : bobSizes)
            sumB += candy;
        
        int targetDiff = ( sumA - sumB)/2;
        Arrays.sort(bobSizes);
        int[] result = new int[2];
        for(int candy : aliceSizes){
            int exchange = binSearch(bobSizes, candy, targetDiff);
            if( exchange != -1){
                result[0] = candy;
                result[1] = exchange;
                break;
            }
        }
        return result;
    }
    static int binSearch(int[] arr, int target , int diff){
        int s = 0, e = arr.length - 1;
        while( s <= e){
            int mid = e - (e - s)/2;
            
            if(target == arr[mid] + diff)
                return arr[mid];
            else if( target < arr[mid] + diff )
                e = mid - 1;
            else if( target > arr[mid] + diff )
                s = mid + 1;
        }
        return -1;
    }
}