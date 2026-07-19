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
    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
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
public class add_at_head_LL {
    public static void main(String[] args) {
        LL ll=new LL();
        ll.addAtHead(10);
        ll.addAtHead(20);
        ll.addAtHead(30);
        ll.addAtHead(40);
        ll.display();
    }
}
