public class firstindex {
    public static int FristIdx(int idx,int arr[],int tar){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==tar){
            return idx;
        }
        int ans=FristIdx(idx+1,arr,tar);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,54,5,0,54};
       
        System.out.println( FristIdx(0, arr, 4));
    }
}
