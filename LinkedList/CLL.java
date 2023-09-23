//1.Insert Node
//2.Display Node
//3.Delete at any node
class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        //this.next=null;
    }
}

class CLList {
    Node head, tail;

    void createNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    void deleteNode(int data){
        Node itr;
        itr=head;
        if(itr.data == data){
            System.out.println("Oh its a first node to delete");
            itr=itr.next;
            tail.next=itr;
            head=itr;
        }
        else{
            do{
                Node temp=itr;
                itr=itr.next;
                if(itr.data == data && itr.next != head){
                    temp.next=itr.next;
                    break;   
                }else if(itr.data == data && itr.next == head){
                    System.out.println("you are about to delete tail node");
                    temp.next=itr.next;
                    temp=tail;
                    break;
                }                
            }while(itr != head);
        }
    }

    void Display() {
        Node itr = head;
        if (itr == null) {
            System.out.println("Empty Circular Linked List");
            return;
        } else {
            System.out.print("Head-->");
            do {
                System.out.print(itr.data + "-->");
                itr = itr.next;
            } while (itr != head);
            System.out.print("Head");
            System.out.println();
        }
    }
}

public class CLL {
    public static void main(String[] args) {
        CLList obj = new CLList();
        obj.createNode(200);
        obj.createNode(201);
        obj.createNode(202);
        obj.createNode(203);
        obj.Display();
        obj.deleteNode(203);
        obj.deleteNode(2003);
        obj.Display();
    }
}
