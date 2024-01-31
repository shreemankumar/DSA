 class A{
    int a;
    String b;
    double c;
    A(){
        System.out.println("overloding");
    } 
    A(int x){
        a=x;
        
    } 
    A(String y){
        b=y;
        
    } 
    A(double z){
        c=z;
        
    } 

}
public class Class{
    public static void main(String[] args) {
         A r = new A();
         A r1 = new A(12);
         A r2 = new A("c");
         A r3 = new A(12.22);
         System.out.println(r1.a);
         System.out.println(r2.b);
         System.out.println(r3.c);
        
        
    }
}