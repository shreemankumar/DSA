class c implements Runnable{
  public void run(){
    for(int i=0;i<4;i++){
        System.out.println("interface");
    }
  }
}
public class B {
    public static void main(String[] args) {
        c t =new c();
        Thread T = new Thread(t);
             T.start(); 

    }
}
