class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        
        if (nums[lo] <= nums[hi]) {
            return nums[lo];
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            } else if (mid < nums.length - 1 && nums[mid + 1] < nums[mid]) {
                return nums[mid + 1];
            } else if (nums[mid] >= nums[lo]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1; 
    }
}
