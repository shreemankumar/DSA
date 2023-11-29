class Solution {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = (long)x;
        long pans = -1 ;
        while(lo <= hi){
            long mid = (lo+hi)/2;
            if(mid * mid == x){
                return(int)mid ;
            }
            else if(mid * mid < x){
                pans = mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }

        }
        return (int)pans; 

    }
}
