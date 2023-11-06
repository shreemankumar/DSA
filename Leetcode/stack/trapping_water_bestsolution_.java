public class trapping_water_bestsolution_ {
    //O(1) time O(1) space
}
class Solution {
    public int trap(int[] height) {
        
     int LB=height[0];
     int RB =height[height.length-1];
    
    int l=0;
    int r=height.length-2;
    int total_water=0;

    while(l<=r){
        if(LB<=RB){
            if(LB<height[l]){
                LB =height[l];
            }
            else{
                total_water+=LB-height[l];
            }
            l++;
        }
        else{
            if(RB<height[r]){
                 RB =height[r];
            }
            else{
                total_water+=RB-height[r];
            }
            r--;
        }
      }
      return total_water;
    }
}

