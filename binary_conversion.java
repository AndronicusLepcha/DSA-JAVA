import java.util.*;
class binary_conversion{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        // int n;
        // int arr[8]={128,64,32,16,8,4,2,1};
        // int i;
         System.out.println("Enter the number");
         int num=sc.nextInt();
        // int temp[];
        // for(i=0;i<8;i++){
        int rem,bin=0,f=1,count=0;
        while(num>0){
            rem=num%2;
            if(rem==1){
                count++;
            }
            bin=bin+rem+f;
            f=f*10;
            num=num/2;
        }
        System.out.println(count);
        
        }
    }