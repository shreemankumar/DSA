package Recursion.class1;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*fact(n-1);

    }
    public static void main(String[] args) {
        System.out.println(fact(4));
        
    }
}
