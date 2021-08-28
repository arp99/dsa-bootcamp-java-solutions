// Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int candy : candies){
            max = candy > max ? candy : max;
        }
        int n = candies.length;
        List<Boolean> result = new ArrayList<Boolean>(n);
        for(int i = 0 ;i < n ; i++){
            if(candies[i] + extraCandies >= max){
                result.add(i , true);
            }else{
                result.add(i, false);
            }
        }
        return result;
    }
}

public class Prob6 {
    public static void main(String[] args) {
        // Enter Your Code Here
    } 
}
