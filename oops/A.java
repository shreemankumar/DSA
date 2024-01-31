/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class B{
    int a =12;
    int b =11;
    void call(){
        int c;
       c=a+b;
        System.out.println("Message"+c);
    }
    void call(int x, int y){
        int c;
       c=x+y;
        System.out.println("Messages"+c);
    }
    void call(int z , double v){
        double c;
       c=z+v;
        System.out.println("Messagess"+c);
    }
    
}
public class A
{
	public static void main(String[] args) {
		B s = new B();
		s.call();
		s.call(1212,2);
		s.call(122,3.4);
	
	}
}
