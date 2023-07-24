// recursion : A function calling it self is called recursion 
//slove for the smallest problem 
//keep a faith that it will work for a smaller problem
//solve for rest of the problem


package Recursion.class1;

public class main {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
   public static void main(String[] args) {
    int a=12;
    int b=2;
    sum(a, b);
    System.out.println(sum(a, b));
    
  
   } 
}
