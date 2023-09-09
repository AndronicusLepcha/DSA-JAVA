// Points to Remember 
// 1. Varaible should be declared outside the Constructor to be available to access by the sub class
// 2. To call the constructor of the parent class use super() and it should be the first staement in the constructor
// 3. The super() should always be inside the constrtuctor only

class Square{
    int total_edges;
    Square(){
        total_edges=4;
    }

}

class Triangle extends Square{
   // int no_edges;
    Triangle(){
        super();
        int no_edges=total_edges-1;
        System.out.println(no_edges);
    }
    
}

public class Shape{
    public static void main(String args[]){
        Triangle ob1 = new Triangle();
        //ob1.show();
    }
}