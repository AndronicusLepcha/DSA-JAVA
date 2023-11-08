//my datatype 
class Student{
    String name;
    int rno;
    float marks;
    //Constructor
    Student(){ //default constructor
        this.name="Robot"; // this keyword is replaced with the object ref name or variable
        this.rno=7;
        this.marks=99.9f;
    }
    //Constructor Overloading
    Student(String name){
        this.name=name;
    }
}
class Class{
    public static void main(String args[]){
        Student myobj=new Student();
        //System.out.println(myobj.name); // initially null
        // myobj.name="Andronicus";
        myobj.rno=90;
        myobj.marks=90f;
        System.out.println(myobj.name);
        System.out.println(myobj.rno);
        System.out.println(myobj.marks);


        Student newobj=new Student("Andro");
        System.out.println(newobj.name);


        // wo refeenrece vaible 
        Student one = new Student();
        Student two=one;
        one.name="Blah Blah";
        System.out.println("name = "+two.name);


        final int INCREASE=90;
        INCREASE=90;
        





    }
}