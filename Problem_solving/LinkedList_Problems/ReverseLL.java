// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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
     //inplace rreversal
    public Node reverse(Node head){
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    void display(Node head){
        Node curent=head;
        while(curent != null){
            System.out.print("-->"+curent.data);
            curent=curent.next;
        }
    }
}
public class ReverseLL{
    public static void main(String[] args) {
        Merge ml = new Merge();
        ml.addNode(4);
        ml.addNode(2);
        ml.addNode(3);
        ml.addNode(1);
        System.out.println("Before");
        ml.display(ml.head);
        System.out.println();
        ml.head=ml.reverse(ml.head);
        ml.display(ml.head);
    }
}
