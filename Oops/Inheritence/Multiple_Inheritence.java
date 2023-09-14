//Interface can only allow you to declare the functions and does not allow you to define the function
// method are always by default abstract and public
//Using interface we can implement MULTIPLE INHERITENCE in JAVA
interface Animal{
    int eyes = 2 ;
    public void walk();
    //void eat();
}
interface Herbivore{
    public void eat();
    //void eat();
}

class Cat implements Animal,Herbivore{    // This is multiple Inheritence 
    public void walk(){
        System.out.println("Cat walks on 4 legs");
    }
    public void eat(){
        System.out.println("Cat also eat meat");
    }
}
class Multiple_Inheritence{
    public static void main(String args[]){
        Cat ob1= new Cat();
        ob1.walk();
        ob1.eat();
    }
}