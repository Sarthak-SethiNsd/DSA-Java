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
    void insertAtIdx(int idx,int value){
        if(idx<0||idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            Node temp=new Node(value);
            temp.next=head;
            head=temp;
            if(tail==null) tail=temp;
            size++;
            return;
        }
        int cnt=0;
        Node t=head;
        while(cnt!=idx-1){
            t=t.next;
            cnt++;
        }
        Node temp=new Node(value);
        temp.next=t.next;
        t.next=temp;
        if(temp.next==null) tail=temp;
        size++;
    }
}

public class insert_at_idx_LL{
    public static void main(String[] args){
        LL ll=new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtIdx(1,50);
        ll.display();
        System.out.println("Size = "+ll.size);
    }
}