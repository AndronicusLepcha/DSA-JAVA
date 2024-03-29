// 1. If you extend a abstract class then you need to implement all the abstract method else 
//     you will encounter compile time error.
// Abstraction is the conecpt in java to show the abstract view of the program
// you can also define the function in abstract class

abstract class Animal{
    // abstract Animal(); we cannot create the abstract constructor
    abstract void legs();
    abstract void dummy();
}

class Cat extends Animal{
    void legs(){
        System.out.println("Cat has four legs");
    }
    void color(){
        System.out.println("color is white");
    }
    void dummy(){
        System.out.println("I am just a dummy function");
    }
}
public class abstract_Class{
    public static void main(String args[]){
        Cat ob1 = new Cat();
        ob1.legs();
        ob1.color();
    }
}