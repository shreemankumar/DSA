package Recursion.class1;
            //Sum Of Natural Nmuber by recursion 
public class SumOfNaturalNumber {
    public static int sumOfNatural(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int sum=n+sumOfNatural(n-1);
        return sum;
    } 
    public static void main(String[] args) {
        System.out.println(sumOfNatural(10));
    }
}
