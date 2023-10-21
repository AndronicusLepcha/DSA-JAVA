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

    public List<Integer> zig(Node root){
        List<Integer> result = new ArrayList<>();

        Deque<Node> dq=new ArrayDeque<>(); // deque created
        dq.offer(root);
        Boolean flag= false;
        
        while( !dq.isEmpty() ){
            if(flag == false){
                int level=dq.size();
                Node node=dq.pollFirst();
                result.add(node.data);

                for(int i=0;i<level;i++){
                    if(node.left!= null){
                        dq.offerLast(node.left);
                    }
                    if(node.right!= null){
                        dq.offerLast(node.right);
                    }
                }
                flag=true;
            }
            if(flag == true){
                int level=dq.size();
                Node node=dq.pollLast();
               
                result.add(node.data);

                for(int i=0;i<level;i++){
                    if(node.right!= null){
                        dq.addFirst(node.right);
                        }
                    if(node.left!= null){
                        dq.addFirst(node.left);
                        }
                    }
                }
                flag=false;
            }
            return result;
        }
        
}
         
class zigzag{
    public static void main(String args[]){
        Tree t= new Tree();
        t.addNode(7);
        t.addNode(5);
        t.addNode(9);
        t.addNode(4);
        t.addNode(6);
        t.addNode(8);
        t.addNode(10);
        t.display();
        // System.out.println(t.levelOrder(t.root));
        // System.out.println(t.average(t.root));
        System.out.println(t.zig(t.root));
    }
}