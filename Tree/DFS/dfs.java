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
    public List <Integer> depthfirstsearch(){
        List <Integer> list = new ArrayList<>();
        display(this.root,list);
        return list;
    }
    void display(Node node,List<Integer> list){
        //in order display
        if(node==null){
            
            return;
        }
        display(node.left,list);
        //System.out.println(node.data);
        list.add(node.data);
        display(node.right,list);
    }
    
}
class dfs{
    public static void main(String args[]){
        Tree t= new Tree();
        t.addNode(4);
        t.addNode(2);
        t.addNode(3);
        t.addNode(1);
        t.addNode(5);
        t.addNode(6);
        t.addNode(7);
        //t.display();
       // System.out.println(t.levelOrder(t.root));
        System.out.println(t.depthfirstsearch());
    }
}