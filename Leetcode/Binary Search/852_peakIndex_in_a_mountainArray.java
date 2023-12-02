class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2 ;
            if(mid-1 < 0){
                if(arr[mid+1] < arr[mid]){
                    return mid ;
                }
                else{
                    lo = mid+1;
                }
            }
            else if(mid+1 >= arr.length){
                if(arr[mid] > arr[mid-1]){
                    return mid;
                }
                else{
                    hi = mid-1;
                }
            }
            else{
                 if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
             if(arr[mid-1] <= arr[mid]){
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
