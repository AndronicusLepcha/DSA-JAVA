//Always the base class constructor is called first in constructor chaining

class Base{
    Base(){
        System.out.println("Base Class Constructor Called");
    }
}

class Child extends Base{
    Child(){
        System.out.println("Child Class Constructor Called");
    }
}

public class constructor_chaining{
    public static void main(String args[]){
        Child ob1 = new Child();
        //ob1.show();
    }
}