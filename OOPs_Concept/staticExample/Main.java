//package staticExample;
class Human{
    int age;
    String name;
    static long population;

    public Human(String name,int age){
        this.name=name;
        this.age=age;
        Human.population +=1 ;
        
    }

}
class Main{
    public static void main(String[] args) {
        System.out.println("Population is "+Human.population); // can access before creating the object
        Human andro= new Human("Androniucs", 21);
        Human raju=new Human("Raju",28);
        System.out.println("Population is "+Human.population);
    }
}
