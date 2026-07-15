class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class get_val_at_index_LL {
    public static int get(Node head, int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
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
        System.out.println(get(a,3)); // 0 based indexing 
    }
}
