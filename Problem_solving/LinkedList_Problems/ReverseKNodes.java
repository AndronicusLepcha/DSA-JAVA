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
    Node OnlyReverse(Node head){
        Node prev=null;
        Node current=head;

        Node next=current.next;
        
        while(current != null){
            current.next=prev;
            prev=current;
            current=next;
            if(next != null){
                next = next.next;
            }    
        }
        head=prev;
        return prev;
    }
    void reverseL2R(Node head,int left,int right){
        Node prev=null;
        Node current=head;
        //taverse till L-1 node 
        for(int i=0; i < left-1;i++){
            prev=current;
            current=current.next;
        }
        Node first=prev;
        Node last=current;

        Node next=current.next;
        for(int i=0;current != null && i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next != null){
                next=next.next;
            }
        } 
        if(first != null){
            first.next=prev;
        }else{
            first=head;
        }
        last.next=current;
    }

    Node ReverseNNodes(Node head,int k){
        if(head == null||head.next == null) 
            return head;
        Node temp = head;
        int length = 0;
        //calculate length 
        while(temp != null)
        {
            length++;
            temp=temp.next;
        }

        Node dummyHead = new Node(0);
        dummyHead.next = head;

        Node pre = dummyHead;
        Node cur;
        Node nex;
        while(length >= k) {
            cur = pre.next;
            nex = cur.next;
           
            for(int i=1;i<k;i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            //this is for not reverse next itertion
            // pre = cur;

            // length = length - k;
            // for(int i=1;i<k;i++) {
            //     pre=cur;
            //     cur=nex;
            //     nex=nex.next;
            // }
            pre = cur;
            length = length - k;
        }
        return dummyHead.next;
    }
        
        
}

public class ReverseKNodes{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(8);
        ll.addNode(7);
        ll.displayNode(ll.head);
        //ll.ReverseNNodes(ll.head,2);
        //ll.displayNode(ll.OnlyReverse(ll.head));
        //ll.reverseL2R(ll.head,2,4);
        
        ll.displayNode(ll.ReverseNNodes(ll.head,2));        
    }
}
