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

    public List<List<Integer>> rightView(Node root) { //BFS
        List<List<Integer>> result = new ArrayList<>();

        if(root==null){
            return result;
        }

        Queue <Node> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> Curresult = new ArrayList<>();
            for(int i=0;i<level;i++){
                Node n=q.poll();
                if(i == level-1){
                    Curresult.add(n.data);
                }

                if(n.left != null){
                    q.offer(n.left);
                }
                 if(n.right != null){
                    q.offer(n.right);
                }
            }
            result.add(Curresult);
        }

        return result;
    }

    // left side view
     public List<List<Integer>> leftView(Node root) { //BFS
        List<List<Integer>> result = new ArrayList<>();

        if(root==null){
            return result;
        }

        Queue <Node> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> Curresult = new ArrayList<>();
            for(int i=0;i<level;i++){
                Node n=q.poll();
                if(i == 0){
                    Curresult.add(n.data);
                }

                if(n.left != null){
                    q.offer(n.left);
                }
                 if(n.right != null){
                    q.offer(n.right);
                }
            }
            result.add(Curresult);
        }

        return result;
    }
}
class SideView{
    public static void main(String args[]){
        Tree t= new Tree();
        t.addNode(34);
        t.addNode(77);
        t.addNode(6);
        t.addNode(20);
        t.addNode(55);
        t.display();
        System.out.println("Right side view " + t.rightView(t.root));
        System.out.println("Left side view "+t.leftView(t.root));
    }
}