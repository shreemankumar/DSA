/*ram is divided into 2 parts 
 * (stack  &  heap)
 * 
 * Student s1 = new Student();
 * 
 * whenever (new keyward)is there , then it will gose into the heap not in stack
 * As new keyward is there , in heap memory ,a space is created for Student (s1). 
 * which is pointing the s1 of main memory to the heap memory.
 * 
 * 
 *   in a class we have 2 things /==========
 *   1: attributes/properties
 *   2: function/method  ====/ (function always store in the stck memory)
 */
class Student{
    //calss = blueprint

    String name;
    int Roll_Number;
    int Class_Number;

    public void Study(){
        System.out.println("Study .");
    }  
    }


public class basics_Of_oops {

 


    public static void main(String[] args) {
        
        Student ram=new Student();
        Student s1 =new Student();
        ram.name="Rama";
        ram.Roll_Number=12;

        System.out.println(ram.name);
        System.out.println("roll number is :"+ram.Roll_Number);
        s1.Study();
        ram.Study();

    }
}
