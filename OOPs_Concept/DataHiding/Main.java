class A{
    private int age; //private data cannot be accesed out of the class but can be accesed inside the class onlt
    int arr[];
    String name; // can be accessed by anyone and by anywhere

    A(int age,int arr[]){
        this.age=age;
        this.arr=arr;
        this.name="Robot";
    }
    int getAge(){ //getter 
        return age;

    }
}

public class Main{
    public static void main(String[] args) {
        int arr[]={1,23,3};
        A obj=new A(34,arr);
        System.out.println(obj.getAge());
        System.out.println(obj.arr[0]);
        System.out.println(obj.arr.length);
        System.out.println(obj.name);
    }
}
