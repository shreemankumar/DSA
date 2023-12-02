class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        if(nums.length == 1){
            return 0;
        }
        while(lo <= hi){
            int mid = (lo+hi)/2 ;
            if(mid-1 < 0){
                if(nums[mid+1] < nums[mid]){
                    return mid ;
                }
                else{
                    lo = mid+1;
                }
            }
            else if(mid+1 >= nums.length){
                if(nums[mid] > nums[mid-1]){
                    return mid;
                }
                else{
                    hi = mid-1;
                }
            }
            else{
                 if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
             if(nums[mid-1] <= nums[mid]){
                 lo = mid+1;   
            }
            else{
               hi = mid-1;
            }
        }       
    }
    return -1;
    }
}

