class Box{
    int l;
    int h;
    int w;

    Box(){
        this.l=1;
        this.h=20;
        this.w=4;
    }
    Box(int l,int h,int w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old){ //copy constructor
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
}
class Box2 extends Box{
    int weight;

    public Box2(){
        this.weight=10;
    }

    public Box2(int l,int h,int w,int weight){
        super(l,h,w); //calling the base class constructor
        this.weight=weight;
    }

}
public class copy_constructor {
    public static void main(String[] args) {
        Box box=new Box();
        Box copy=new Box(box);
        Box2 ob=new Box2();
        System.out.println(box.l +" "+box.h+" "+box.w);      
        System.out.println(copy.l +" "+copy.h+" "+copy.w);     // instace of copy accerssing the data 
        System.out.println(ob.l +" "+ob.h+" "+ob.w+" "+ob.weight); 

        Box2 ob2=new Box2(12,34,55,777);
        System.out.println(ob2.l +" "+ob2.h+" "+ob2.w+" "+ob2.weight); 
    }
}
