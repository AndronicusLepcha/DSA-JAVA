class Car{
    String color;
    String brand;

    void show_color(){
        System.out.println("My color is "+ this.color);
    }

    void show_brand(){
        System.out.println("My brand name is"+ this.brand);
    }
}

public class classes_objects{
    public static void main(String args[]){
        Car object=new Car();
        object.color="red";
        object.brand="Mahindra";
        object.show_color();
        object.show_brand();


        Car ob2 = new Car();
        ob2.color="blue";
        ob2.show_color();
    }
}