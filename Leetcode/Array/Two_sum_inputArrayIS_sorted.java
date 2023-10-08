class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // here nested loop is not working cozs 
        //  in 1 sec = 10^8 or 10^9 opration we can
        // in this q. n=3*10^4 constraints 
        // for n^2=9*10^8 which is approximitally equal to 10^8 or 10^9
        //if I touch or around it , 10^*8 or 10^9  . the function would'nt work

    int n=numbers.length;
    int i=0;
    int j=n-1;
   
    while(i<j){
         int csum =numbers[i]+numbers[j];// csum = current sum
         if(csum<target){
             i++;
         }
         else if(csum>target){
             j--;
         }
         else{
             return new int[]{i+1,j+1}; // as it is based on 1 index so i+1 and j+1
         }
            
    }
        return new int[]{};


    }
}


