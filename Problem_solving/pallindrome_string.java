class Solution {
    public boolean isPalindrome(int x) {
        boolean ans=false;
        String str=Integer.toString(x);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i); //concatinating from back of the string 
        }
        if(str.equals(rev)){
            //System.out.println("True");
            ans=true;
        }
        else{
            ans=false;
        }
        return ans;
    }
}
public class Main
{
	public static void main(String[] args) {
	Solution s=new Solution();
	boolean a=s.isPalindrome(-121);
	System.out.println(a);
	}
}