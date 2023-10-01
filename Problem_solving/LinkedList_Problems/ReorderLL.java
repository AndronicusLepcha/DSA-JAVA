class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node tail=null;
    Node head=null;
    int length;

    void addNode(int data){
        length++;
        Node node=new Node(data);
        if(head == null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    void displayNode(Node head){
        Node itr=head;
        //System.out.print("head");
        while(itr != null){
            System.out.print("--> "+itr.data);
            itr=itr.next;
        }
        System.out.print("-->null\n");
    }

    Node getMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    Node reverse(Node node){
        if(head == null){
            return head;
        }
        Node prev=null;
        Node current=node;
        Node next=current.next;

        while(current != null){
            current.next=prev;
            prev=current;
            current=next;
            if(next != null){
                next=next.next;
            }
        }
        //head=prev;
        return prev;
    }
    void reorder(Node head){
        if(head==null || head.next == null){
            return;
        }
        Node mid=getMid(head);
        Node hs=reverse(mid);
        Node hf=head;
        //rearange 
        while(hf != null && hs != null){
            Node temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if( hf != null){
            hf.next=null;
        }

    }
}

public class ReorderLL{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(8);
        //ll.addNode(7);
        ll.displayNode(ll.head);
        //ll.reverse(ll.head);
        // ll.head=ll.getMid(ll.head);
        // ll.head=ll.reverse(ll.head);
        ll.reorder(ll.head);
        ll.displayNode(ll.head);
        
    }
}
