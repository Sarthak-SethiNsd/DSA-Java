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
    int size;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
            size++;
            return;
        }
        tail.next=temp;
        tail=temp;
        size++;
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
    void deleteAtIdx(int idx){
        if(idx<0||idx>=size){
            System.out.println("Invalid deletion");
            return;
        }
        if(idx==0){
            head=head.next;
            if(head==null) tail=null;
            size--;
            return;
        }
        int cnt=0;
        Node temp=head;
        while(cnt!=idx-1){
            temp=temp.next;
            cnt++;
        }
        Node t=temp.next;
        temp.next=t.next;
        if(temp.next==null) tail=temp;
        size--;
    }
}

public class delete_at_idx_LL{
    public static void main(String[] args){
        LL ll=new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.deleteAtIdx(1);
        ll.display();
    }
}