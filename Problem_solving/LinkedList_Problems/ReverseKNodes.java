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
    
    void ReverseNNodes(Node head,int k){
        if(k<=1 ||head ==null){
            return;
        }
        Node prev=null;
        Node current=head;
       
        while(true){
            Node last=prev;
            Node newEnd=current;

            Node next=current.next;

            for(int i=0;current != null && i<k ;i++){
                current.next=prev;
                prev=current;
                current=next;
                if(next != null){
                    next=next.next;
                }
            }
            if(last != null){
            last.next=prev;
            }else{
                head=prev;
            }
            newEnd.next=current;
       
            if(current == null){
                break;
            }
             prev=newEnd;
            }
        }
        
        
     }

public class ReverseKNodes{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        // ll.addNode(8);
        //ll.addNode(7);
        ll.displayNode(ll.head);
        ll.ReverseNNodes(ll.head,2);
        ll.displayNode(ll.head);
        
    }
}
