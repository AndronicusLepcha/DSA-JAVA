// Anyone can access the static variable 
// memory will be taken only for one time for static variable

class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school="RPSS";
    }
}

class Static{
    public static void main(String args[]){
        Student.school="SMIT";
        System.out.println(Student.school);
        Student s1 = new Student();
        s1.changeSchool();
        System.out.println(Student.school);
    }
}