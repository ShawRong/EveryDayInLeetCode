/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int end = n;
        int begin = 1;
        while(begin < end){
            int mid = begin + (end - begin) / 2;
            if(isBadVersion(mid)){
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return begin;
    }
}