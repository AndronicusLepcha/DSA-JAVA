class Base{
    public void show(){
        System.out.println("This is function from BASE Class");
    }
}

class Child extends Base{

}

public class Single_Inheritence{
    public static void main(String args[]){
        Child ob1 = new Child();
        ob1.show();
    }
}