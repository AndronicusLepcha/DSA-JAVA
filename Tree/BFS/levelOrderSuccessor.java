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

    // public List<List<Integer>> levelOrder(Node root) { //BFS
    //     List<List<Integer>> result = new ArrayList<>();

    //     if(root==null){
    //         return result;
    //     }

    //     Queue <Node> q= new LinkedList<>();
    //     q.offer(root);

    //     while(!q.isEmpty()){
    //         int level=q.size();
    //         List<Integer> Curresult = new ArrayList<>();
    //         for(int i=0;i<level;i++){
    //             Node n=q.poll();
    //             Curresult.add(n.data);

    //             if(n.left != null){
    //                 q.offer(n.left);
    //             }
    //              if(n.right != null){
    //                 q.offer(n.right);
    //             }
    //         }
    //         result.add(Curresult);
    //     }

    //     return result;
    // }

    // //average of each level
    // public List<Double> average(Node root) { //BFS
    //     List<Double> result = new ArrayList<>();

    //     if(root==null){
    //         return result;
    //     }

    //     Queue <Node> q= new LinkedList<>();
    //     q.offer(root);

    //     while(!q.isEmpty()){
    //         Double average=0.0;
    //         int level=q.size();
    //        // List<Integer> Curresult = new ArrayList<>();
    //         for(int i=0;i<level;i++){
    //             Node n=q.poll();
    //             //Curresult.add(n.data);
    //             average += n.data;

    //             if(n.left != null){
    //                 q.offer(n.left);
    //             }
    //              if(n.right != null){
    //                 q.offer(n.right);
    //             }
    //         }
    //         result.add(average/level);
    //     }

    //     return result;
    // }
    int Successor(Node root,int key){
        if(root==null){
            return 0;
        }
        Queue <Node> q=new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int level=q.size();
            for(int i=0;i<level;i++){
                Node node=q.poll();
                
                if(node.data == key){
                    Node n=q.poll();
                    return n.data;
                }
                if(node.left!= null){
                    q.offer(node.left);
                }
                if(node.right!= null){
                    q.offer(node.right);
                }
            }
        }
        return 0;
    }
}
class levelOrderSuccessor{
    public static void main(String args[]){
        Tree t= new Tree();
        t.addNode(4);
        t.addNode(2);
        t.addNode(3);
        t.addNode(5);
        t.addNode(6);
        t.display();
        // System.out.println(t.levelOrder(t.root));
        // System.out.println(t.average(t.root));
        System.out.println(t.Successor(t.root,3));
    }
}