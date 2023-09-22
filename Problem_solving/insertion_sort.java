import java.util.*;
class insertion_sort{
	public static void main(String args[]){
		//System.out.println("hello Robot");
		int arr[]={34,2,33,1,9};
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
