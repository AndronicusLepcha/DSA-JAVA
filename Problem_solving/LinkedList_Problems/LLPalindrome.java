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
    boolean isPalindrome(){
        Node mid=getMid(head);
        //System.out.print(mid.data);
        Node secondhead=reverse(mid);
        Node temp=secondhead;
        displayNode(temp);
    //compare both halves
        while(head !=null && secondhead != null){
            if(head.data != secondhead.data){
                break;
            }
            System.out.println(head.data+" "+secondhead.data);
            head=head.next;
            secondhead=secondhead.next;
        }
        //reverse(temp);
        if(secondhead == null){
            return true;
        }else{
            return false;
        }
    }
}

public class LLPalindrome{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        //ll.addNode(7);
        //.displayNode(ll.head);
        //ll.reverse(ll.head);
        // ll.head=ll.getMid(ll.head);
        // ll.head=ll.reverse(ll.head);
        ll.displayNode(ll.head);
        System.out.println(ll.isPalindrome());
        
    }
}
