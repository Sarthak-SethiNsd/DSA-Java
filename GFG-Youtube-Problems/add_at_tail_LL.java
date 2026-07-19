class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LL{
    Node head;
    Node tail;
    void addAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class add_at_tail_LL{
    public static void main(String[] args) {
        LL ll=new LL();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
    }
}