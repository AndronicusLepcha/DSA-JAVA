import ReverseNumber.ReverseNumber;
public class Pallindrom {
    public static void main(String[] args) {
        isPallindrom(121);
    }
    static void isPallindrom(int n){

        if(n==ReverseNumber.reverseNumber2(n)){
            System.out.println("Number is Pallindrom");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}
