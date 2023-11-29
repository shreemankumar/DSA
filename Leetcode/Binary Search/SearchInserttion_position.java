        // leetcode 35
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ceil = nums.length ;
        int lo = 0;
        int hi = nums.length - 1 ;

        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if( nums[mid] > target){
                ceil = mid;
                hi = mid-1;
            }
            else{
                 lo= mid+1;
            }
        }
        return ceil;
    }
}