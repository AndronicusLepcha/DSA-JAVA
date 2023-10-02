import java.util.*;
class Tree{
    static private class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    Node root;
    void createTree(Scanner sc){
        System.out.println("Enter the root node ");
        int data=sc.nextInt();
        root=new Node(data);
        populate(sc,root);
    }
    void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter the value  to the left of "+node.data);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Ente the data");
            int data=sc.nextInt();
            node.left=new Node(data);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter the value  to the right of "+node.data);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Ente the data");
            int data=sc.nextInt();
            node.right=new Node(data);
            populate(sc,node.right);
        }
    }
    void dispaly(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        dispaly(node.left);
        dispaly(node.right);
    }

}
class ST{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Tree t=new Tree();
        t.createTree(sc);
        t.dispaly(t.root);
    }
}