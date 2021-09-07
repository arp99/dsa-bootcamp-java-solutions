// Guess Number Higher or Lower

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1 , l = n;
        int result = -1;
        while( s <= l){
            int mid = l - ( l  - s )/2;
            int rsGuess = guess(mid);
            if(rsGuess == 0){
                result = mid;
                break;
            }
            else if( rsGuess == -1){
                l = mid - 1;
            }
            else if( rsGuess == 1){
                s = mid + 1;
            }
        }
        return result;
    }
}