public class Trapping_rainwater {
    public static void main(String[] args) {
        class Solution {
            public int trap(int[] height) {
                int n= height.length;
                int[] lmax=new int[n];
                lmax[0]=height[0];
                for(int i=1;i<n;i++){
                    lmax[i]=Math.max(lmax[i-1],height[i]);
                }
                int[] rmax = new int[n];
                rmax[n-1]=height[n-1];
                for(int i=n-2;i>=0;i--){
                    rmax[i]=Math.max(rmax[i+1],height[i]);
                }
        
                int total_water=0;
        
                for(int i=0;i<n;i++){
        
                    int max_hight=Math.min(lmax[i], rmax[i]);
                    int max_water=max_hight-height[i];
                   int  current_water=max_water*1;
                    total_water+=current_water;
                }
                return total_water;
        
            }
        }
    }
}
