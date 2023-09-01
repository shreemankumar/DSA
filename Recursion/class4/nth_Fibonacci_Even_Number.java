
import java.util.Scanner;
public class nth_Fibonacci_Even_Number {
    public static int Nthfibonaccievennumber(int n){
        if(n==0){
            return 0; 

        }
        if(n==1){
            return 2;
        }
        int ans=4 * Nthfibonaccievennumber(n-1)+Nthfibonaccievennumber(n-2);
        return ans;
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int n=sc.nextInt();

      int even=  Nthfibonaccievennumber(3);
      System.out.println(even);
    }
}
