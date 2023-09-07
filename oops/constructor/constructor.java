class Student{
    //Constructor in java non-parameterised
    //Constructor should have same name as Class name
    Student(){
        System.out.println("I am Constructor i will get executed only one time during the class is initialised");
    }

}
public class constructor{
    public static void main(String args[]){
        Student ob1 = new Student();
    }
}