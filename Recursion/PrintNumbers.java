// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10


public class PrintNumbers {
    public static void main(String args[]){
        print(10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
        
        
    }
}
