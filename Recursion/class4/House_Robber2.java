import java.util.Scanner;

public class House_Robber2 {

    public static int houseRobber(int idx,int end,int arr[]){
        if(idx > end){
            return 0;
        }
    

        //rob current house
        int rob=houseRobber(idx+2, end, arr)+arr[idx];

        //skip current house 
        int skip =houseRobber(idx+1, end, arr);

        // take max of both of this 
        int ans =Math.max(rob,skip);

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println(arr[0]);
            return ;
        }
        int startForm0=houseRobber(0, n-2, arr);
        int startForm1=houseRobber(1, n-1, arr);

        int ans=Math.max(startForm0, startForm1);
        System.out.println(ans);
        

    }
}
