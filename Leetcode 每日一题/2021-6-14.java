/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int end = n;
        int begin = 1;
        while(begin < end){
            int mid = begin + (end - begin) / 2;
            int res = guess(mid);
            if(res == -1){
                end = mid - 1;
            } else if(res == 1) {
                begin = mid + 1;
            } else {
                begin = mid;
                break;
            }
        }
        return begin;
    }
}