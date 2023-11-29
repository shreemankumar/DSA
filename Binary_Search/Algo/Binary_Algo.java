import java.util.Scanner;
public class Binary_Algo{

    public static int  Binary_Search_alog(int n,int[] arr,int ele){
        int lo=0;
        int hi=n-1;
       

        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == ele){
                return arr[mid];
            }
            else if(arr[mid] > ele){ 
                // search space is in leftside
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number (n) :");
    int n=sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter ele which u want to find :");
    int ele=sc.nextInt();

    int index= Binary_Search_alog(n,arr,ele);
    System.out.println( "ans is in index :"+index);
    }
}