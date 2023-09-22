import java.util.*;
class selection_sort{
	public static void main(String args[]){
		int arr[]={5,4,3,2,1};
 		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			if(min != i){
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
 		}
		int i;
 		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]+"\t");
 		}
	}

}
