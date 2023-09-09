class Student{
    //Constructor in java non-parameterised
    //Constructor should have same name as Class name
    String name;
    int age;
    
    Student(String name,int age){

        System.out.println("I am Parameterized Constructor i will get executed only one time when object of my class is created ");
        this.name=name;
        this.age=age;
        System.out.println("Age is "+age+"Name is "+name);
    }

}
public class para_constructor{
    public static void main(String args[]){
        Student ob1 = new Student("Andronicus",21);
    }
}