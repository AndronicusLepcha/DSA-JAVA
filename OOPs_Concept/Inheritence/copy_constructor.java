class Box{
    int l;
    int h;
    int w;

    Box(){
        this.l=1;
        this.h=20;
        this.w=4;
    }

    Box(Box old){ //copy constructor
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
}
public class copy_constructor {
    public static void main(String[] args) {
        Box box=new Box();
        Box copy=new Box(box);
        System.out.println(box.l +" "+box.h+" "+box.w);      
        System.out.println(copy.l +" "+copy.h+" "+copy.w);     // instace of copy accerssing the data  
    }
}
