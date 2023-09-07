// Function Overloading in java is Compile Time Polymorphism
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name is "+name);
    }

    public void printInfo(int age){
        System.out.println("Age is "+age);
    }

    public void printInfo(String name,int age){
        System.out.println("Name is "+name+""+"Age is "+age);
    }
}

public class Compile_Time{
    public static void main(String args[]){
        Student ob1= new Student();
        ob1.name="Andro";
        ob1.age=21;
        ob1.printInfo(ob1.name,ob1.age);
    }
}