// Check if the Sentence Is Pangram
// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, 
// return true if sentence is a pangram, or false otherwise.

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        int n = sentence.length();
        for(int i = 0; i< n;i++){
            arr[sentence.charAt(i) - 'a'] = true;
        }
        for(boolean b : arr){
            if(!b)
                return false;
        }
        return true;
    }
}
