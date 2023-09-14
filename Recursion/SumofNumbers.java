public class SumofNumbers {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    static int sum(int n){
        if(n%10 == n ){
            return n;
        }
        // int rem=n%10;
        // n=n/10;

        //return (n%10)+sum(n/10);
        return (n%10)*sum(n/10);

    }
}
