
public class A {
    public static void main(String[] args) {
        A r = new A();
    }
    A(){
        System.out.println("w");
    }
    {
        System.out.println("e");// instance blok = it can written inside a class only but not inside a method
        // we can use variable only inside it not method, for this keyward u have to create an obj . without obj it will not work 
    }
    // static{
    //     System.out.println("s");// static keyward = deals with class only not needed of obj
    // }
}
