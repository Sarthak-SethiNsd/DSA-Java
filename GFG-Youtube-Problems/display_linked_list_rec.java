class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class display_linked_list_rec {
    public static void display_rec(Node head){
        Node temp=head;
        if(temp==null) return;
        System.out.println(temp.val);
        display_rec(temp.next);
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        Node f=new Node(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display_rec(a);
    }
}
