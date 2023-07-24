package Recursion.class2;
                    
                    //power

public class Main {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int sAns=power(x, n-1);
        int ans=x*sAns;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 9));
    }
    
}
