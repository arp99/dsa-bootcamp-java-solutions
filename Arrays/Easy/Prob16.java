// Find Numbers with Even Number of Digits
// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEvenDigits(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean isEvenDigits(int num){
        int count= 0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count % 2 == 0;
    }
}