import java.util.*;
class quicksort{
	public static int partition(int arr[],int s,int e){
		int i,j,temp,copy,pivot,count=0;
		// initialise pivot
		pivot=arr[e];
		for(i=0;i<arr.length-1;i++){
			if(pivot>=arr[i]){
				count=count+1;
			}
		}
		int pindex=count-1;	
		//put the pivot in right index
		temp=arr[pindex];
		arr[pindex]=pivot;
		arr[e]=temp;
			
		//check the rightside and leftside make all left side element as smaller that pivot and viseversa
		i=s;
		j=e;
		while(i<pindex && j>pindex){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<pindex && j>pindex){
				copy=arr[i];
				arr[i]=arr[j];
				arr[j]=copy;
				}
		}
		return pindex;
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
