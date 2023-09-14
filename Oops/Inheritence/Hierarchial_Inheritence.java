//Level 0
class Base{
    public void show(){
        System.out.println("This is function from BASE Class");
    }
}
//Level 1
class ChildOne extends Base{
    //The show function is with me
    ChildOne(){
        show();
    }
}
//Level 1
class ChildTwo extends Base{
    ChildTwo(){
        System.out.println("Child Two Class");
    }
}
 
public class Hierarchial_Inheritence{
    public static void main(String args[]){
        ChildOne ob1 = new ChildOne();

        ChildTwo ob2 = new ChildTwo();
        ob2.show();
        //ob2.display();
    }
}