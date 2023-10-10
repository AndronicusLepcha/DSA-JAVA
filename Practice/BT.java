import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
class Tree{
    Node root;
    void CreateRoot(Scanner sc){
        System.out.println("Enter the root node: ");
        int data=sc.nextInt();
        root=new Node(data);
        populateTree(root,sc);
    }

    void populateTree(Node node,Scanner sc){
        
        System.out.println("Do you want to enter in the left of the node (True / False) :");
        boolean choice=sc.nextBoolean();
        if(choice){
            System.out.println("Enter the data ");
            int data=sc.nextInt();
            node.left=new Node(data);
            populateTree(node.left,sc);
        }
        //Right 
        System.out.println("Do you want to enter in the right of the node (True / False) :");
        choice=sc.nextBoolean();
        if(choice){
            System.out.println("Enter the data ");
            int data=sc.nextInt();
            node.right=new Node(data);
            populateTree(node.right,sc);
        }
        
    }
    void display(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }
}
class BT{
    public static void main(String args[]){
        Tree t=new Tree();
        Scanner sc= new Scanner(System.in);
        t.CreateRoot(sc);
        t.display(t.root);
    }
}