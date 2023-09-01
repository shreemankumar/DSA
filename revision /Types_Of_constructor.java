/*conctructor is 2 types 
 * 1: defult constructor /======(conctructor wid no parameter)
 * 2: parametrized constructor /=====(conctructor wid parameter)
 */

class type{
    String type1;
    String name;
    // defult constructor /=========
    public type(){
        System.out.println("rr");
         name ="Dsa";
        
    }

    public type(String n ,String r){
        System.out.println("ram");
         name =n;
        type1=r;
        
        
    }
    public void make(){
        System.out.println("ee");
     }
     public void mak(){
        System.out.println("e");
        this.make();
    }
}

//parametrized constructor /========




public class Types_Of_constructor {
    public static void main(String[] args) {
         type course =new type();  
         System.out.println(course.name);
         type c =new type("hare ","krishna");
         System.out.println(c.type1);
         System.out.println(c.name);
        course.mak();
    }
}
