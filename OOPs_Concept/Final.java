class Garbage{
    String name;
    Garbage(String name){
        this.name=name;
    }

    @Override
    protected  void finalize() throws Throwable{
        System.out.println("Object is Destroyed");
    }
}
class Example{
    String name;
    final int val=90;
    //val=88;
}
class Final{
    public static void main(String args[]){
        final Example obj=new Example();
        obj.name="Robot"; // see i am able to do changes in the obj so final doest not hold true
        System.out.println("name "+obj.name);
        //also it cannt reassign

       // obj=new Example(20); this is not allowed 

        //obj.val=99; Not allowed
        System.out.println("name "+obj.val);



        //garbage collector
        Garbage ob1= new Garbage("Robot");
        for(int i=0;i<10000000;i++){
            ob1=new Garbage("Robot");
        }
        
    }
}