import javafx.scene.chart.PieChart.Data;

class Node{
    int data;
    Node next;

    public Node(int d){
    this.data=d;

    }
}

public class Foundation{
    static Node head;
   static  Node tail;

    public static void addLast(int  data){
        Node nn= new Node(data) ;
         tail.next=nn;
         tail=nn;
    }
    public static void main(String[] args) {
        
        Node f=new Node(7);
        

        Node s= new Node(0);
        
        
        Node r= new Node(1);
        head=f;
        tail=r;
         

        //connecting frist and second   (Node@15db9742 )
        f.next=s;
        s.next=r;
       addLast(0);
       addLast(45);
       
        System.out.println(tail.next.data);
         
        

        
    }
}