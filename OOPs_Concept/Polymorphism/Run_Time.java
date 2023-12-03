// The concept of Runtime Polymorphism is to overide the function during runtime 
// Which can be achieved using inheritence, so the same function you write and extends from the base class
// will now be overidden in the child class
class Base{
    public void show(){
        System.out.println("This is function from BASE Class");
    }
}

class Child extends Base{
    public void show(){ //function overriding here
        System.out.println("Overiding the show function that is extended from the base calass");
    }
}

public class Run_Time{
    public static void main(String args[]){
        Child ob1 = new Child();
        ob1.show();
    }
}