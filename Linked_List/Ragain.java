import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data=d;
    }
}

public class Ragain {
    static Node head;
    static Node tail;

    public static void Add_Last(int data){

        Node nn= new Node(data);

        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
       
    }
    public static void main(String[] args) {
         
         head =null;
         tail=null;
         for(int i=0;i<=10;i++){
            Add_Last(i);
            System.out.println(head.data);
         }
        

        // System.out.println(head.data);
    }
    
}
