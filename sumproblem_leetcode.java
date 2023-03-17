//leetcode sum problem
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.
class Solution {
    public void show(){
        int nums[]={2,7,11,15};
        int target=9;
        int i,n,j;
        n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int num=target;
                if(num==nums[i]+nums[j]){
                    System.out.println("Output:"+i +j);
                }
            }
        }
    }    
}
class HelloWorld {
    public static void main(String[] args) {
        Solution s=new Solution();
        s.show();
    }
}