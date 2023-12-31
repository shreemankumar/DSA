public class NPE {
    public static void main(String[] args) {
        String str = null;
        int c = 0;
        int b =12;
        int a ;
      try{
        a = b/c;
        
      }
      catch(ArithmeticException e){
        System.out.println("this is out of bond" + e);
      }
    }
}
