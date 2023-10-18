class ST2{
    public static void main(String args[]){
        int arr[]={3,8,7,6,-2,-8,4,9};
        ST2 node=new ST2(arr);
        node.display();
        System.out.println(node.query(0,1));
        node.update(0,100);
        System.out.println(node.query(0,0));
        //node.display();
        }

    public static class Node{
        int data;
        Node left;
        Node right;
        int start,end;
        private Node(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    Node root;

    private ST2(int[] arr){
        this.root=createTree(arr,0,arr.length-1);
    }
    Node createTree(int[] arr,int start,int end){
        if(start==end){
            //leaf node
            Node leaf=new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        //create node at where you are 
        Node node=new Node(start,end);

        // find the mid

        int mid=(start+end)/2;

        node.left=this.createTree(arr,start,mid);
        node.right=this.createTree(arr,mid+1,end);

        node.data=node.left.data+node.right.data;

        return node;

    }
    public void display() {
    display(this.root);
  }
  private void display(Node node) {
    String str = "";

    if(node.left != null) {
      str = str + "Interval=[" + node.left.start + "-" + node.left.end + "] and data: " + node.left.data + " => "; 
    } else {
      str = str + "No left child";
    }

    // for current node
    str = str + "Interval=[" + node.start + "-" + node.end + "] and data: " + node.data + " <= "; 
    
    if(node.right != null) {
      str = str + "Interval=[" + node.right.start + "-" + node.right.end + "] and data: " + node.right.data; 
    } else {
      str = str + "No right child";
    }

    System.out.println(str + '\n');

    // call recursion
    if(node.left != null) {
      display(node.left);
    }

    if(node.right != null) {
      display(node.right);
    }
  }
  int query(int start,int end){
      return this.query(this.root,start,end);
    }
  private int query(Node node,int start,int end){
      if(node.start >= start && node.end <= end){
        //inside the query interval
        return node.data;
      }else if(node.start > start || node.end <end){
        //outside the query
        return 0;
      }else{
        //overlapping
        return this.query(node.left,start,end)+this.query(node.right,start,end);
      }
  }
  void update(int indx,int val){
    this.root.data=update(this.root,indx,val);
  }
  private int update(Node node,int indx,int val){
    if(indx >= node.start && indx <= node.end){ //inside the range
      if(indx == node.start && indx == node.end){
        //base case
        node.data=val;
        System.out.println("Node data updated");
        return node.data;

      }else{
        int right=update(node.right,indx,val);
        int left=update(node.left,indx,val);
        node.data = left+right;
        return node.data;
      }
    }
    //if index is out of range
     //System.out.println("Node data updated");
    return node.data;
  }
}