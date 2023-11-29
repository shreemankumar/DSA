class Solution {
    public int FindFirstOcc(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1; 
        int firstOccOf_t = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  
            if (nums[mid] == target) {
                firstOccOf_t = mid;
                hi = mid - 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return firstOccOf_t;
    }

    public int FindLastOcc(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;  
        int lastOccOf_t = -1;  

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  
            if (nums[mid] == target) {
                lastOccOf_t = mid;
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lastOccOf_t;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] occ = new int[2];
        occ[0] = FindFirstOcc(nums, target);
        occ[1] = FindLastOcc(nums, target);
        return occ;
    }
}

