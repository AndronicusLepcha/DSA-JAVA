class ST2{
    public static void main(String args[]){
        int arr[]={3,8,7,6,-2,-8,4,9};
        ST2 node=new ST2(arr);
        node.display();
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
}