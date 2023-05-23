import java.util.*;
class q_sort{
	public static int partition(int arr[],int s,int e){
		int i,j,temp,pivot;
		pivot=arr[e];
		j=s-1;
		for(i=s;i<e;i++){
			if(arr[i]<pivot){
				j++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}	
		j++;
		temp=arr[j];
		arr[j]=pivot;
		arr[e]=temp;
		
		return j;	
	}
	public static void quicksort(int arr[],int s,int e){
		if(s<e){
			int pivot=partition(arr,s,e);
			quicksort(arr,s,pivot-1);
			quicksort(arr,pivot+1,e);
			
		}		
	}
	public static void main(String args[]){
		int arr[]={9,4,3,2,1,5};
		int n=arr.length;
		quicksort(arr,0,n-1);
		for(int i=0;i<n;i++){
				System.out.println(arr[i]);
			}
	}
}
