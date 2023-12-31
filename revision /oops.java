public class oops{
    int a;
     oops(){
        a=5;
    }
    oops(oops ref){
       a=ref.a; 
       System.out.println(a);
    }
    public static void main(String[] args){
        // dry =  do not repeate your self
        //abstract =  hide internal details show only enssitial detail 
        // Encapsulation =  putting various components together in capsule to make . sensitive datas are hide to the user
        // inharitance =  the act of derivng new things form existing things 
        //polymerphism =  one entity many forms 
        // constructor which does not have any parameter is called defalut 

        oops s = new oops();
        oops s1 = new oops(s);
        

    }
}