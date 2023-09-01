//package Recursion.class2;

public class PrintArray {
    public static void printarray(int idx,int[] arr){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printarray(idx+1, arr);
        //System.out.println(arr[idx]);

    }
    public static void main(String[] args) {
        int arr[]={3,8};
        printarray(0, arr);
        
    }
}
