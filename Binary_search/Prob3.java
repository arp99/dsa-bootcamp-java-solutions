// First Bad Version
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int minVersion = n+1;
            int s = 1, l = n;
            while( s <= l){
                int mid = l - ( l - s ) / 2;
                if(isBadVersion(mid)){ //version is bad, then search before
                    l = mid - 1;
                }
                else if( !isBadVersion(mid)){//version is good, then search after
                    s = mid + 1;
                }
            }
            return s;
        }
    }