class Node{
    int value;
    Node next;

    //if only one value 

    Node(int value){
        this.value=value;
        this.next=null;
    }

    //If value and next is send

    Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
}
class List{
    Node head;
    Node tail;
    int size;
    List(){
        this.size=size+1;
    }
    void CreateNode(int value){
        Node node=new Node(value);
        head=node;
        tail=node;
    }
    void addNode(int value){
        Node node=new Node(value,null);
        tail.next=node;
        tail=node;
    }

    void Display(){
        Node itr=head;

        if(itr == null){
            System.out.println(head.value);
        }else{
            while(itr != null){
                System.out.print(itr.value+"-->");
                itr=itr.next;
                //System.out.print(itr.value+"-->");
                
            }
            System.out.print("Null");
            System.out.println();
        }

    }
}


public class LL {
    public static void main(String[] args) {
        List ll=new List();
        ll.CreateNode(200);
        ll.addNode(201);
        ll.addNode(202);
        ll.Display();
    }
}
