import java.util.*; 
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    void addNode(int data){
        if(root==null){
            root=new Node(data);
        }else{
            addNewNode(root,data);
        }
    }
    void addNewNode(Node node,int data){
        if(node.data<data){
            if(node.right == null){
                node.right=new Node(data);
            }else{
                addNewNode(node.right,data);
            }
        }
        if(node.data>data){
            if(node.left == null){
                node.left=new Node(data);
            }else{
                addNewNode(node.left,data);
            }
        }
    }
    void display(){
        display(this.root);
    }
    void display(Node node){
        //in order display
        if(node==null){
            return;
        }
        display(node.left);
        System.out.println(node.data);
        display(node.right);
    }

    // Cousin
    boolean Cousin(Node root,int x,int y){
        Node xx=findNode(root,x);
        Node yy=findNode(root,y);

        return (level(root,xx,0) == level(root,yy,0)) && (!isSibling(root,xx,yy));
    }
    Node findNode(Node root,int x){
        if(root == null){
            return null;
        }
        if(root.data == x){
            return root;
        }
        Node n=findNode(root.left,x);
        if(n != null ){
            return n;
        }
        return findNode(root.right,x);
    }
    int level(Node root,Node node,int lev){
        if(root == null){
            return 0;
        }
        if(root== node){
            return lev;
        } 
        int l=level(root.right,node,lev+1); // if taget node is found in right subtree then return the lev
        if(l != 0){
            return l;
        }
       // return level(root.right,node,lev+1);
        return level(root.left,node,lev+1);
        
    }
    boolean isSibling(Node root,Node x, Node y){
        if(root == null){
            return false;
        }
        return (root.left == x && root.right==y) || (root.left == y && root.right==x) || isSibling(root.right,x,y) || isSibling(root.right,x,y);
    }

}
class isCousin{
    public static void main(String args[]){
        Tree t= new Tree();
        t.addNode(34);
        t.addNode(77);
        t.addNode(6);
        t.addNode(20);
        t.addNode(55);
        t.display();
        //System.out.println("Level of 20 is " + t.level(t.root,20,0));
        System.out.println("Is Cousin " + t.Cousin(t.root,77,6));

        
    }
}