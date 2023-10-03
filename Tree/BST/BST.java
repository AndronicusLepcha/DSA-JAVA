//1.BST Insertion
//2.Calculate Height
//3.Balanced tree or not
import java.util.*;
class Tree{
    static class Node{
        int value;
        Node left;
        Node right;
        int height;
        Node(int value){
            this.value=value;
            // this.left=null;
            // this.right=null;
        }
    }
    Node root;
    void createTree(Scanner sc){
        int data;
        System.out.println("Eenter the root node");
        data=sc.nextInt(); 
        root=new Node(data);

        boolean ch;
        System.out.println("Do you want to add other node ");
        ch=sc.nextBoolean();

        while(ch){
            System.out.println("Enter the data : ");
            data=sc.nextInt();
            addNode(root,data);
            System.out.println("Do you want to add other node ");
            ch=sc.nextBoolean();
        }
        prettyDisplay(root,0);
        
    }

    void addNode(Node node,int data){
       if(data<node.value){
            if(node.left == null){
                node.left=new Node(data);
            }else{
                addNode(node.left,data);
            }
       }else{
            if(node.right== null){
                node.right=new Node(data);
            }else{
                addNode(node.right,data);
            }
       }
    }

    int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }

    boolean isBalanced(Node node){
        return getHeightForBaalancedCheck(node) != -1;
    }

    int getHeightForBaalancedCheck(Node node){ // O(n) Time complexity  to calculate height aswell as balanced
        if(node == null){
            return 0;
        }
        int leftHeight=getHeightForBaalancedCheck(node.left);
        if(leftHeight == -1 ) return -1;

        int rightHeight=getHeightForBaalancedCheck(node.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight-rightHeight) > 1 ) return -1;

        return Math.max(leftHeight,rightHeight)+1;
    }



    void prettyDisplay(Node node){
        prettyDisplay(root,0);
    }
    void prettyDisplay(Node node,int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level != 0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
       
    }
}
class BST{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Tree t=new Tree();
        t.createTree(sc);
        System.out.println(t.root);
        int h=t.getHeight(t.root);
        System.out.println("Tree Height is "+h);
        System.out.println("Is tree balanced ? : "+t.isBalanced(t.root));
    }
}