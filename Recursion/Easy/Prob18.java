import java.util.ArrayList;

// Return a list of indices of a target inside an array
class Solution{
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,3,7,8,3};
        ArrayList<Integer> result = findAllIndices(arr,3,0);
        System.out.print(result);
    }
    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index){
        ArrayList<Integer> ans = new ArrayList<>();

        if( index == arr.length )
            return ans;
        //index for current function call only
        else if( arr[index] == target ){
            ans.add(index);
        }
        //now get the answer for future function calls
        ArrayList<Integer> ansFutureCalls = findAllIndices(arr, target, index + 1);

        //now that we have the answer for current call and the future call, lets merge with
        //current call and return to previous function call
        ans.addAll(ansFutureCalls);
        return ans;
    }

}