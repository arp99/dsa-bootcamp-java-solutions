/**
    Let's call an array arr a mountain if the following properties hold:
    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... arr[i-1] < arr[i]
    arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    Given an integer array arr that is guaranteed to be a mountain, 
    return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int n = arr.length;
        int s = 1 , l = n-2;
        while( s <= l ){
            int mid = l -(l - s)/2;
            if( arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                peak = mid;
                break;
            }
            //if left side is greater peak is probably on left
            else if( arr[mid - 1] > arr[mid]){
                l = mid - 1;
            }
            //else if right side is greater peak is probably on right
            else if( arr[mid + 1] > arr[mid]){
                s = mid + 1;
            }
        }
        return peak;
    }
}