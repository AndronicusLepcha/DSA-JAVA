class Student{
    //Constructor should have same name as Class name
    String name;
    int age;
    //Parameterized Constructor
    Student(String name,int age){

        System.out.println("I am Parameterized Constructor i will get executed only one time when object of my class is created ");
        this.name=name;
        this.age=age;
        System.out.println("Age is "+age+"Name is "+name);
    }
    //copy constructor 
    Student(Student ob2){

        System.out.println("I am Parameterized Constructor i will get executed only one time when object of my class is created ");
        this.name=ob2.name;
        this.age=ob2.age;
        System.out.println("Age is "+age+"Name is "+name);
    }

}
public class copy_constructor{
    public static void main(String args[]){
        Student ob1 = new Student("Andronicus",21);
        Student ob2 = new Student(ob1); //passing the object 1 to the other object
    }
}