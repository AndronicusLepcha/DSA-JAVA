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
    void displayNode(){
        Node itr=head;
        //System.out.print("head");
        while(itr != null){
            System.out.print("--> "+itr.data);
            itr=itr.next;
        }
        System.out.print("-->null\n");
    }
    Node reveseBetween(Node head,int left,int right){
        if(left==right){
            return head;
        }
        //skip the first left-1 nodes 
        Node current = head;
        Node prev=null;
        for(int i=0; current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }

        Node last=prev;
        Node newEnd=current;

        //reverse between left and right
        Node next=current.next;
        for(int i=0; current !=null && i<right-left+1;i++){
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
        return head;

    }
}

public class ReverseSublist{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);
        ll.addNode(7);
        ll.displayNode();
        ll.head=ll.reveseBetween(ll.head,2,6);
        ll.displayNode();
        
    }
}
