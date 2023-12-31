/*  constructor:
    function inside your class wid same name as your class and no return_type.
 */


class company{
    String name;
    int ctc;
    String location;
    // constructor /===================
    void company(){
        System.out.println("Air India");
    }
}
// memory location of the constructor is same as your class
class course extends company{
    String name ;
    String type ;
    //conctructor /====================
    
    void company(){
        System.out.println("Let's go!!!!");
    }
}



public class Constructor {
    public static void main(String[] args) {
       company airindia =new company(); // it will call the constructor automatically, it will creat heap memory.
       company google=new company();
       course Coding_Ninja =new course(); 
    airindia.company();

    }
}
