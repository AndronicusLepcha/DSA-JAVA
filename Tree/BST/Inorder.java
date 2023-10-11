//  L->N->R
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
    void createBST(Scanner sc){
        System.out.println("Enter the root node: ");
        int data=sc.nextInt();
        root=new Node(data);
        
        System.out.println("Do you want to add other data in BST: ");
        Boolean ch=sc.nextBoolean();

        while(ch){
            System.out.println("Enter the data you want to add: ");
            data=sc.nextInt();
            addNode(root,data);
            System.out.println("Do you want to add other data in BST: ");
            ch=sc.nextBoolean();
        }
    }
    void addNode(Node node,int data){
        if(node.data < data){
            if(node.right == null){
                node.right=new Node(data);
            }else{
                addNode(node.right,data);
            }
        }
        if(node.data > data){
            if(node.left == null){
                node.left=new Node(data);
            }else{
                addNode(node.left,data);
            }
        }
    }
    void preetyDisplay(Node node){ //inorder
        if(node==null ){
            return;
        }
        preetyDisplay(node.left);
        System.out.println(node.data);
        preetyDisplay(node.right);
        //System.out.println(node.data);
        
    }
}
class Inorder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Tree t=new Tree();
        t.createBST(sc);
        t.preetyDisplay(t.root);
    }
}