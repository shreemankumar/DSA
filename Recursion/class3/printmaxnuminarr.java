//package Recursion.class3;

public class printmaxnuminarr {
    public static int  maxnumarr(int idx,int arr[]){
        if(idx == arr.length){
            return 0 ;
        }
        int sans=maxnumarr(idx+1, arr);
        // int ans =Math.max(sans,arr[idx]);
        if(sans>arr[idx]){
            return sans;
        }
        else{
           return arr[idx];
        }
    }
    public static void main(String[] args) {
     int arr[]={3,4,2,6};   
     System.out.println(maxnumarr(0, arr));  

    }
}
