import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> mymap = new HashMap<>();
        // add key,value pair in map
        mymap.put(12, "ram");
         mymap.put(2, "sita");
        
        // print these values or see them 
        // how to loop around 
        
        // in syntax : you get an entry set (is a key value player) = which is stored in map.entery 
        // and this loop is foreach loop , here 'm' is a variable . and from this variable u can get key and value IllegalAccessError
        // instread of Map.Entry , we can use var ,(which is a datatype in case of when we don't know the data type it is then we use var )
        // and it is automatically convert in to the exact datatpe that u want to that
        
        
        // for (Map.Entry m : mymap.entrySet()) {    // Map.entry is like a datatype 
        //     System.out.print(m.getKey() + ",");
        //     System.out.println(m.getValue());
        // }
        
        // remove 
        
        //mymap.remove(2,"sita");
        //mymap.remove(2);
        // for(var m : mymap.entrySet()){
        //     System.out.print(m.getKey()+",");
        //     System.out.println(m.getValue());
        // }
        
        // loop 
        for(int key : mymap.keySet()){
            System.out.print(key +",");
            System.out.println(mymap.get(key));
        }
        //  To check weather the key is present or not   ... contain that key yes or no
        if(mymap.containsKey(2) == false){
            System.out.println("does not contians");
        }
        else{
            System.out.println("it contians");
        }

    }
}
