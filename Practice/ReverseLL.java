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

    void reverse(Node node){
        if(node == tail){
            head=tail;
            return;
        }else{
            reverse(node.next);
            tail.next=node;
            tail=node;
            tail.next=null;
        }
    }

    Node Reverse(Node head){
        if(head==null){
            return head;
        }
        Node prev=null;
        Node present=head; 
        Node next=present.next;

        while(present != null){
            present.next=prev;
            prev=present;
            present=next;
            if(next != null){
                next=next.next;
            }
        }
        return prev;
    }
}

public class ReverseLL{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);
        ll.addNode(7);
        ll.displayNode(ll.head);
        ll.head=ll.Reverse(ll.head);
        ll.displayNode(ll.head);
    }
}
