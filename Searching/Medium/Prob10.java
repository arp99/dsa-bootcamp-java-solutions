// 875. Koko Eating Bananas 
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBananas = 1_000_000_000;
        int start = 1, end = maxBananas;
        while( start < end ){
            int mid = (start + end)/2;
            if(canBananasBeFinished(piles, mid, h)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
    static boolean canBananasBeFinished(int[] piles, int k, int maxHours ){
        int count = 0;
        for(int  bananas : piles){
            count += ( bananas - 1) / k + 1;
        }
        return count <= maxHours;
    }
}