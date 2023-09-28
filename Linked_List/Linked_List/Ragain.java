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
    public static void Add_First(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    public static void Display(){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
            System.out.println();
        }

    }
    public static void Remove_First(){
        if(head!=null){
          head= head.next;
        }
        //System.out.println();
    }
    
    public static Node Gets_At(int idx){
        if(idx<0){
            System.out.println("null");
            return null;
        }
        Node curr=head;
        for(int i=0;i<idx;i++){
            if(curr==null){
                System.out.println("null");
                return null;
            }
            curr=curr.next;
        }
        return curr;
    }
    public static void Add_At(int idx,int data){
        if(idx==0){
            Add_First(data);
            return ;
        }
        Node nn=new Node(data);

        Node curr=Gets_At(idx-1);
        Node nextOfCurr =curr.next;

        curr.next=nn;
        nn.next=nextOfCurr; 
        

    }
    public static Node Remove_Last(){
       {
        if(head ==null)// for size 0
        {
            return null;
        }
        else if(head ==tail) // for size 1
        {
            Node tr=tail;
            Remove_First();
            return tr;
        }
        else{
             Node curr=head;
             while(curr.next!=tail)
             {
                curr=curr.next;
            }
            curr.next=null;
            //updating tail
            Node tr =tail;
            tail=curr;
            return tr;
        }
        
        }
    }
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);  
       System.out.println("Enter the size :");
       int n=sc.nextInt();
         head =null;
         tail=null;
         System.out.println("Enter the element :");
         for(int i=0;i<n;i++){
            int a =sc.nextInt();
            Add_Last(a);
         }
        //  Add_First(11111);
        //  Add_First(12);
        

        // System.out.println(head.data);
        // System.out.println(tail.data);

        // Display();
         //Remove_First();
        // Display();
    //    Node ans= Gets_At(1);
    //    if(ans!=null)
    //      System.out.println(ans.data);
         Remove_Last();
         Display();
         
    }
    
}
