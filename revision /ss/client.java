import java.util.Scanner;
/**
 * client
 */
public interface client{
    void input();   // public and abstract 
    void output();   //public and abstract 
    
}

class raju implements client{
    String name ;
    double salary ;
   public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("User name : ");
        name = sc.nextLine();
        System.out.println("User salary : ");
        salary = sc.nextDouble();
    }
   public void output(){
        System.out.println(name+" ");
        System.out.println(salary+" ");
    }
    public static void main(String[] args) {
        client c=new raju();
        c.input();
        c.output();
    }
}