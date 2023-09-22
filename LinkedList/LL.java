//1.Creating node
//2.Insert at the End
//3.Display the LL
//4.Deletion at any index
//5.Searching a node

import java.util.*;
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
    Scanner sc = new Scanner(System.in);
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

    void deleteNode(){
        System.out.println("Enter the postion where you want to delete index(0-n)");
        int pos=sc.nextInt();
        Node itr=head;
        int curerent_index=0;

        if (pos==0){
            head=head.next;
            System.out.println("Deleted node at index "+pos);
        }else{
            while(itr != null){
                curerent_index++;
                Node temp=itr;
                itr=itr.next;
                if(curerent_index == pos){
                    itr=itr.next;
                    temp.next=itr;
                    System.out.println("Deleted node at index "+pos);
                    break;
                }
            }
        }

    }

    void searchNode(){
        Display();
        System.out.println("Enter the data to search in node");
        int value=sc.nextInt();
        Node itr=head;
        int index = 0;
        while(itr != null){
            if(itr.value == value){
                System.out.println("Data is present at index "+index);
                break;
            }
            itr=itr.next;
            if(itr==null){
                System.out.println("No data found 404 Error");
            }
        }

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
        ll.deleteNode();
      //  ll.Display();
        ll.searchNode();
    }
}
