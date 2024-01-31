class trdd extends Thread{
    public void run(){
        for(int i=0;i<= 5; i++){
            System.out.println("ram");
        }
    }
}

public class trd{
    public static void main(String[] args) {
        trdd t = new trdd();
       t.start();
       for(int i=0;i<= 5; i++){
        System.out.println("shree");
    } 
    }
}
