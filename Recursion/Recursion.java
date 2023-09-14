public class Recursion{
    public static void main(String args[]){
        print10(1);
    }
    static void print10(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print10(n+1);  //Tail recursion cause this is last function call
        
    }
}