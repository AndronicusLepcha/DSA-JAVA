public class Main
{
	public static void main(String[] args) {
    int arr[]={10,45,76,89,90,99};
    int n,i,temp=0;
    int high=0;
    n=arr.length;
    for(i=0;i<n;i++){
            if(arr[i]>high){
                temp=high;
                high=arr[i];
               
            }
        }
         System.out.println("the second highest no is"+temp);
        
	}
}