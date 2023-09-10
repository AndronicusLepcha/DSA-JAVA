//Interface can only allow you to declare the functions and does not allow you to define the function
// method are always by default abstract and public
interface Animal{
    int eyes = 2 ;
    public void walk();
    //void eat();
}

class Cat implements Animal{
    public void walk(){
        System.out.println("Cat walks on 4 legs");
    }
}
class Interface{
    public static void main(String args[]){
        Cat ob1= new Cat();
        ob1.walk();
    }
}