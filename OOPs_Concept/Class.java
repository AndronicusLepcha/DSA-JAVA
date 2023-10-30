//my datatype 
class Student{
    String name;
    int rno;
    float marks;
}
class Class{
    public static void main(String args[]){
        Student myobj=new Student();
        System.out.println(myobj.name); // initially null
        myobj.name="Andronicus";
        System.out.println(myobj.name);

    }
}