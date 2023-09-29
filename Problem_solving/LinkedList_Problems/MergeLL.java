class Merge{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head,tail;
    void addNode(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }
    void dispaly(Node head){
        Node curent=head;
        while(curent != null){
            System.out.print("-->"+curent.data);
            curent=curent.next;
        }
    }
    Node getMid(Node head) {
        Node midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    Node divideLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //cut the list to two halves
        Node prev=null,slow=head,fast=head;
        while(fast != null && fast.next != null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        //call recursively
        Node left=divideLL(head);
        Node right=divideLL(slow);
        return conquer(right,left);

    }
    Node conquer(Node left, Node right) {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
   
    
        while (right != null && left != null) {
            if (right.data <= left.data) {
                tail.next = right;
                right = right.next;
            } else {
                tail.next = left;
                left = left.next;
            }
            tail=tail.next;
        }
    
        while(right != null) {
            tail.next = right;
            right=right.next;
        }
        while(left != null) {
            tail.next = left;
            left=left.next;
        }
        
    
        return dummyNode.next;
    }
    
    
}
class MergeLL{
    public static void main(String[] args) {
        Merge ml = new Merge();
        ml.addNode(4);
        ml.addNode(2);
        ml.addNode(3);
        ml.addNode(1);
        System.out.println("Before merge sort");
        ml.dispaly(ml.head);
        System.out.println();
        ml.head=ml.divideLL(ml.head);
        System.out.println("After  merge sort");
        ml.dispaly(ml.head);
    }
}