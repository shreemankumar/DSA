public class TrappingRainwater_monotonic_stack {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int trap(int[] height) {
        Stack<Integer> st =new Stack<>();
        int total_water =0;

        for(int i=0;i<height.length;i++){
            while(st.size()>0 && height[i]>height[st.peek()]){
                int r=i;// next greatest element on right side
                int curr_val = height[st.pop()];// my height
            
            if(st.size()==0){
                // there is no left greatest element is present there 
                break;
            }
            int l=st.peek();//next greatest element on right side
            int width=r-l-1;
            int total_height=Math.min(height[r],height[l]);
            int water_height= total_height-curr_val;
            total_water+=(width*water_height);
        }
            st.push(i);
             }
        return total_water;
    }
    
}
