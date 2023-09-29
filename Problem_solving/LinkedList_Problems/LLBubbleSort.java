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
}
public class LLBubbleSort {
    public static void main(String[] args) {
        Merge ml = new Merge();
        ml.addNode(4);
        ml.addNode(2);
        ml.addNode(3);
        ml.addNode(1);
        System.out.println("Before merge sort");
        ml.dispaly(ml.head);
        System.out.println();
    }
    
}
