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
    void findMiddle(){
        int mid=length/2+1;
        Node itr=head;
        while(mid!=0){
            itr=itr.next;
            mid--;
        }
        System.out.println("Mid element is "+itr.data);
    }
    void findMiddleNode(){
        Node fast=head;
        Node slow=head;
        while(fast.next != null && fast != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Mid element is "+slow.data);
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
}

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(200);
        ll.addNode(300);
        ll.addNode(400);
        ll.addNode(500);
        ll.addNode(600);
        ll.displayNode();
        ll.findMiddle();
        ll.findMiddleNode();
    }
}
