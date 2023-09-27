class findIsHappy{
    public boolean isHappy(int num){   
        int slow=num;
        int fast=num;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    public int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }
}
public class Happyno{
    public static void main(String[] args) {
        findIsHappy f=new findIsHappy();
        System.out.println(f.isHappy(12));
    }
}