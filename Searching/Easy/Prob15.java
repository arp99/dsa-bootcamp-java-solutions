package Easy;
// Check If N and Its Double Exist
class Solution {
    public boolean checkIfExist(int[] arr) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(! map.containsKey(num))
                map.put(num, 1);
            else{
                map.put(num, map.get(num) + 1);
            }
        }
        for(int num : arr){

            if( num == 0 && map.containsKey(0)){
               if(map.get(0) > 1)
                    return true; 
            }
            else if( map.containsKey(2*num) )
                return true;
        }
        return false;
    }
}