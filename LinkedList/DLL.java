//1. Create Node
//2. addNode at last 
//3.Display from start to end
//4.Display from end to first
//5.addNode at  any index
//6.Delete at any index
import java.util.*;
class Node{
    int value;
    Node next;
    Node prviousNode;

    Node(int value){
        this.value=value;
        this.next=null;
        this.prviousNode=null;
    }
    Node(int value,Node prviousNode,Node next){
        this.value=value;
        this.prviousNode=prviousNode;
        this.next=next;
    }
}
class createDLL{
    Scanner sc= new Scanner(System.in);
    Node head,tail;
    void createNode(int value){
        Node node=new Node(value);
        head=node;
        tail=node;
    }
    void addNode(int value){
        Node node=new Node(value,tail,null);
        tail.next=node;
        tail=node;
    }
    void addNodeAtAnyIndex(int value){
        
        display();
        System.out.println("Enter the index to add the data/node(0-n)");
        int pos=sc.nextInt();
        int index=0;
        Node itr=head;
        //System.out.println(head.value);
        while(itr != null){
            if(pos==0){
                Node node=new Node(value);
                node.next=itr;
                itr.prviousNode=node;
                head=node;
                System.out.println("inserted");
                break;
            }else{
                Node temp=itr.prviousNode;
                if(pos==index){
                    Node node=new Node(value);
                    node.next=itr;
                    node.prviousNode=temp;
                    itr.prviousNode=node;
                    temp.next=node;
                    System.out.println("inserted");
                    break;
                }
            }
            index++;
            itr=itr.next;
            if(itr.next==null){
                System.out.println("I think you want to enter in the last index");
                Node node=new Node(value,itr,null);
                itr.next=node;
                tail=node;
                break;
                
            }
        }
    }

    void deleteAtAnyIndex(){
        display();
        System.out.println("Enter the Position to delete the node");
        int pos=sc.nextInt();
        Node itr=head;
        Node temp;
        int index=0;
        while(itr !=null){
            if(pos==0){
               temp=itr.next;
               //System.out.println("hello0");
               temp.prviousNode=null;
               head=temp;    
               break; 
            } 
            else if(pos == index){
                //temp=itr;
                if(itr.next==null){
                    //System.out.println("Its last index");
                    temp=itr.prviousNode;
                    temp.next=null;
                    break;
                }
                temp=itr.prviousNode;
                itr=itr.next;
                itr.prviousNode=temp;
                temp.next=itr;
                break;
            }
            itr=itr.next;
            index++;
        }


    }

    void display(){
        System.out.print("null->");
        Node itr=head;
        while(itr != null){
            System.out.print(itr.value+"-->");
            itr=itr.next;
        }
        System.out.println("null");
    }
    void displayBackward(){
        System.out.print("null->");
        Node itr=tail;
        while(itr != null){
            System.out.print(itr.value+"-->");
            itr=itr.prviousNode;
        }
        System.out.println("null");
    }
}


public class DLL {
    public static void main(String[] args) {
        createDLL dll=new createDLL();
        dll.createNode(100);
        dll.addNode(101);
        dll.addNode(200);
        dll.display();
        dll.displayBackward();
        dll.addNodeAtAnyIndex(900);
        dll.deleteAtAnyIndex();
        dll.display();
        //System.out.println(dll.tail.value);
        dll.displayBackward();
        
    }
}
