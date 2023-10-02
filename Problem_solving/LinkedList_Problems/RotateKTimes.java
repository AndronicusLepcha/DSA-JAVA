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
    //Rotate K times
    Node RotateKTimes(Node head,int k){
        while(k != 0){
            Node last=head;
         
            while(last != null){
                Node temp=last;
                last=last.next;
                if(last.next==null){
                    temp.next=null; //will strip the last-1 node 
                    last.next=head; //will now point to the head
                    head=last;//head moves to the last node
                    break;
                }
            }
            k--;
        }
        return head;
    }
        
}

public class RotateKTimes{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(8);
        ll.addNode(7);
        ll.displayNode(ll.head);
        ll.displayNode(ll.RotateKTimes(ll.head,2));
    }
}
