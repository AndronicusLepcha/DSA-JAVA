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
        if(node.data>data){
            if(node.right == null){
                node.right=new Node(data);
            }else{
                addNewNode(node.right,data);
            }
        }
        if(node.data<data){
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

    public List<List<Integer>> zig(Node root){

        List<List<Integer>> fresult = new ArrayList<>();
        if(root == null){
            return fresult ;
        }

        Deque<Node> dq=new ArrayDeque<>();

        dq.add(root);
    //flag
        boolean flag=false;

        while( !dq.isEmpty() ){
            List<Integer> result = new ArrayList<>();
            int level= dq.size();
            System.out.println("Level Size is "+level);
            for(int i=0;i<level;i++){
                if(flag == false){
                //normal oorder remove from front add in back
                 System.out.println("I am  "+flag);
                     
                    Node node=dq.pollFirst(); //remove from front
                    System.out.println("I am removed "+node.data);

                    result.add(node.data);
                    //add its child if exist
        
                        if(node.right != null){
                            dq.addLast(node.right);
                            System.out.println("I am added in last "+node.right.data);
                        }
                        if(node.left != null){
                            dq.addLast(node.left);
                            System.out.println("I am added in last "+node.left.data);

                        }
                }else{
                //remove from back add in front
                    System.out.println("I am  "+flag);
                    Node node=dq.pollLast();
                    System.out.println("I am removed "+node.data);
                    result.add(node.data);
                    
                //add its child if exist
              
                    if(node.right != null){
                        dq.addFirst(node.right);
                        System.out.println("I am added in first  "+node.right.data);

                    }
                    if(node.left != null){
                        dq.addFirst(node.left);
                        System.out.println("I am added in fist "+node.left.data);

                    }
                } 
            }
            flag=!flag;
            fresult.add(result);
        }
        return fresult;
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