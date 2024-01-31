/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    void show(){
        System.out.print("super");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.print("over riding");
    }
}
public class Main
{
	public static void main(String[] args) {
		
		B x = new B();
		x.show();
	}
}

