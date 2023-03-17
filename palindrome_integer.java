//Checking integer pallindrome without string conversion

public class Main
{
	public static void main(String[] args) {
    int x=124;
    int rev=0;
    while(x>0){
            rev=rev*10+(x%10);
            x=x/10;
        }
    System.out.println(rev);
    if(rev-x==0){
            System.out.println("Pallindrome");    
        }
    else{
            System.out.print("not Pallindrome");
        }
	}
}