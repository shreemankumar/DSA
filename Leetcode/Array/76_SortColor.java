class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                red++;  
            }
            if(nums[i]==1){
                white++;  
            }
        }
        int r=red+white;

        int i=0;
        int j=0;
        while(i<red){
             nums[i]=0;
             i++;
        }
        
    while(i<r){
            nums[i]=1; 
            i++;
        }
        while(i<n){
             nums[i]=2;
             i++;
        }
    }           
}
    

