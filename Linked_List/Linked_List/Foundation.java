import javafx.scene.chart.PieChart.Data;
import java.util.Scanner;
class Node{
    int data;
    Node next;

    public Node(int d){
    this.data=d;
    this.next=null;
    }
}

public class Foundation{
    static Node head;
   static  Node tail;

    public static void addLast(int  data){
        Node nn= new Node(data) ;// to attach a node to last as tail
        if(head==null){
            head=tail=nn;
        }
         else{
            tail.next=nn;
         tail=nn;
         }
    }  
    public static void addFirst(int data){
        Node nn= new Node(data);
        if(head == null){
            head=tail=nn;       // to attach a node as head
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    public static void display(){
        Node curr = head;
        while(curr!=null){                      // to display 
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    } 
    public static  Node getAt(int idx){             
        if(idx<0){
            System.out.println("out of range");
            return null;
        }

        Node curr=head;
        for(int i=0;i<idx;i++){
            if(curr==null){
                System.out.println("out of range");
                return null;
            }
            curr=curr.next;
        }
        return curr;
    }
    public static void main(String[] args) {
       head =null;
       tail=null;

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            
            addLast(a);
            addFirst(a);
        }
        display();

        Node ans =getAt(5);
        if(ans!=null){
            System.out.println(ans.data);
        }
       
    }
}