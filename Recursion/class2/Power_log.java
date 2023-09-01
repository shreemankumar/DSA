//package Recursion.class2;

//import Recursion.class1.main;

public class Power_log {
    public static int power_change_faith(int x,int n){
        if(n==0){
            return 1;
        }
        int sAns=power_change_faith(x, n/2);
        int ans=0;
        if(n%2==0){
            ans=sAns*sAns; 
        }
        else{
            ans=sAns*sAns*x;
        }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println( power_change_faith(2, 9));
        
    }
}
