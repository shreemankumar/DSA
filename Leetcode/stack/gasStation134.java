class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Total_gas=0;
        for(int g:gas){
            Total_gas+= g;
        }
        int Total_distance=0;
        for(int c:cost){
            Total_distance+=c;
        }

        if(Total_distance>Total_gas){
            return -1;
        }
        int start=0;
        int remaining_gas=0;
        for(int i=0;i<cost.length;i++){
            remaining_gas+=gas[i];

            if(remaining_gas>=cost[i]){
                remaining_gas-=cost[i];
            }
            else{
                start=i+1;
                remaining_gas=0;
            }
        }
        return start;
    }
}