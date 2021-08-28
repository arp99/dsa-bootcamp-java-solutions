// Add to Array-Form of Integer
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> digitArr = new ArrayList<Integer>();
        int sum = 0 , n = num.length;
        
        for(int i = n - 1 ; i>= 0 ; i--){
            sum = num[i] + k;
            digitArr.add( sum % 10);
            k = sum / 10;
        }
        //if k > num then add remainig digit to list
        while( k > 0){
            digitArr.add(k % 10);
            k /= 10;
        }
        //reverse the list
        Collections.reverse(digitArr);
        return digitArr;
    }
}