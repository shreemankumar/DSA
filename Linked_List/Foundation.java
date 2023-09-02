class Node{
    int data;
    Node next;
}

public class Foundation{
    public static void main(String[] args) {
        Node f=new Node();
        f.data=5;

        Node s= new Node();
        s.data=4;

        Node r= new Node();
        r.data=12;

        //connecting frist and second   (Node@15db9742 )
        f.next=s;
        s.next=r;
        System.out.println(s.next.data);
        
    }
}