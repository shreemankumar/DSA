package Recursion.class1;

public class printIncreasingDecreasing {
    public static void pdthenpi(int n){
        if(n==0){
            return;

        }
        System.out.println(n);
        pdthenpi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        pdthenpi(4);
    }
}
