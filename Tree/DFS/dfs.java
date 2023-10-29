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
    // public List <Integer> depthfirstsearch(){
    //     List <Integer> list = new ArrayList<>();
    //     display(this.root,list);
    //     return list;
    // }
    // void display(Node node,List<Integer> list){
    //     //in order display
    //     if(node==null){
            
    //         return;
    //     }
    //     display(node.left,list);
    //     //System.out.println(node.data);
    //     list.add(node.data);
    //     display(node.right,list);
    // }

    int diameter=0;
    int diameter(Node node){
        height(node);
        return diameter;
    }

    int height(Node node){
        if(node == null ){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right); 

        int dia=left+right;

        diameter= Math.max(diameter,dia);

        return Math.max(right,left)+1;
    }

    Node swap(Node node){
        if(node == null){
            return null;
        }
        Node left=swap(node.left);
        Node right=swap(node.right);
        //swap
        node.right=left;
        node.left=right;

        return node;
    }
    void displayTree(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        displayTree(node.left);
        displayTree(node.right);
    }

    Queue<Integer> q= new LinkedList<>();
    void Flatten(Node node){
        if(node == null){
            return;
        }
        q.offer(node.data);
        Flatten(node.left);
        Flatten(node.right);
    }

    void flatten(Node root){
        if(root == null){
            return;
        }
        Node current= root;
        while(current != null){
            if(current.left != null){
                Node temp=current.left;
                //find the last right node
                while(temp.right != null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left =null;
            }
            current=current.right;
        }

    }
    boolean isValidBST(Node root){
        return helper(root,null,null);
    }
    public boolean helper(Node node , Integer low,Integer high){
        if(node == null){
            return true;
        }
        if( low!= null && node.data <= low){
            return false;
        }
        if(high != null && node.data >= high){
            return false;
        }
        boolean leftTree=helper(node.left,low,node.data);
        boolean rightTree=helper(node.right,node.data,high); 

        return leftTree&&rightTree;
    }

    public Node commonAncestor(Node root,Node p , Node q){
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        Node left = commonAncestor(root.left,p,q);
        Node right = commonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }

        return left == null ? right : left;
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
        t.displayTree(t.root);  
        // l.addNode(90);
        // l.addNode(80);
        //t.display();
       // System.out.println(t.levelOrder(t.root));
        //System.out.println(t.depthfirstsearch());
        //System.out.println(t.diameter(t.root));
        // t.Flatten(t.root);
        // t.flatten(t.root);
        // t.displayTree(t.root);
        System.out.println(t.isValidBST(t.root));

    }
}