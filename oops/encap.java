/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    // encaptulation 
    private int value; // data hiding 
    public void setvalue(int x){
        value= x;
    }
    public int getvalue(){
        
        
        return value;
    }
}
public class encap
{
	public static void main(String[] args) {
		A r = new A();
		 r.setvalue(233);
	
		System.out.print(r.getvalue());
	}
}
