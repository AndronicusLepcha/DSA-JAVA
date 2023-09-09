//Level 0
class Base{
    public void show(){
        System.out.println("This is function from BASE Class");
    }
}
//Level 1
class ChildOne extends Base{
    //The show function is with me
    public void display(){
        System.out.println("Display function from the ChildOne Class");
    }
}
//Level 2
class ChildTwo extends ChildOne{
    ChildTwo(){
        System.out.println("Child Two Class");
    }
}
 
public class Multi_Level_Inheritence{
    public static void main(String args[]){
        ChildTwo ob1 = new ChildTwo();
        ob1.show();
        ob1.display();
    }
}