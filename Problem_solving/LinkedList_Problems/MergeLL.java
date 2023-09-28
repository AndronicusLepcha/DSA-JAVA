class Merge{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head,tail;

    Merge(){
        head=null;
    }

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
    Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next != null && fast != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid=findMid(head); //this will give me mid 
        //split the linked list
        Node nextofMid=mid.next;
        mid.next=null;

        Node left=mergeSort(head);
        Node right=mergeSort(nextofMid);
        return merge(left,right);
    }
    Node merge(Node left,Node right){
        Node dummy=new Node(0);
        Node tail=dummy;
        while(left != null && right != null){
            if(left.data< right.data){
                tail.next=left;
                left=left.next;
            }else{
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }
        if(left != null){
            tail.next=left;
        }else{
            tail.next=right;
        }
        return dummy.next;
    }

    void dispaly(Node head){
        Node curent=head;
        while(curent != null){
            System.out.print("-->"+curent.data);
            curent=curent.next;
        }
    }
}
class MergeLL{
    public static void main(String[] args) {
        Merge ml = new Merge();
        ml.addNode(12);
        ml.addNode(31);
        ml.addNode(2);
        ml.addNode(4);
        System.out.println("Before merge sort");
        ml.dispaly(ml.head);
        System.out.println();
        ml.head = ml.mergeSort(ml.head);
        System.out.println(ml.head);
        System.out.println("After merge sort");
        //ml.dispaly(ml.head);
    }
}