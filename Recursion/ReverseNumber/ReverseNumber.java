package ReverseNumber;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber2(12345));
        reverseNumber(12345);
        //System.out.println(sum);
    }
    static int sum;
    static void reverseNumber(int n){
        if(n%10 == 0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseNumber(n/10);
    }

    public static int reverseNumber2(int n){
        if(n%10 == 0){
            return n;
        }
        String str=Integer.toString(n);
        double rem=n%10*Math.pow(10,str.length()-1);
        int a = (int)rem;

        //sum=sum*10+rem;
        return a + reverseNumber2(n/10);
    }
}
