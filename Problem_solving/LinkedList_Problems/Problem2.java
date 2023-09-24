
import java.util.*;
class Node{
    int value;
    Node next;

    //if only one value 

    Node(int value){
        this.value=value;
    }
}
class List{
    Scanner sc = new Scanner(System.in);
    Node head;
    Node tail;
    Node temp;
  
    void addNode(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
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
            }
            System.out.print("Null");
            System.out.println();
        }
    }
    void mergeList(List firstList,List secondList){
        Node List1=firstList.head;
        Node List2=secondList.head;

        List merge=new List();

        while(List1 != null && List2 != null){
            if(List1.value<=List2.value){
                merge.addNode(List1.value);
                List1=List1.next;
            }else{
                merge.addNode(List2.value);
                List2=List2.next;
            }
        }
        while(List1 != null){
            merge.addNode(List1.value);
            List1=List1.next;
        }
        while(List2 != null){
            merge.addNode(List2.value);
            List2=List2.next;
        }
        merge.Display();
    }
}
public class Problem2 {
    public static void main(String[] args) {
        List firstList=new List();
        List secondList=new List();
        firstList.addNode(200);
        firstList.addNode(300);
        
        firstList.Display();
        secondList.addNode(200);
        secondList.addNode(350);
        secondList.addNode(358);
        secondList.addNode(950);
        secondList.Display();
        List ans= new List();
        ans.mergeList(firstList, secondList);

    }
    
}
