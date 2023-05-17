import java.util.*;
class mergesort{

	public static void conquer(int arr[],int si,int mid,int ei){
			int indx1,indx2;
			indx1=si;
			indx2=mid+1;
			int x=0,i,j;
			int new_arr[]=new int[ei-si+1];

			while(indx1<=mid && indx2<=ei){
				if(arr[indx1]<arr[indx2]){
					new_arr[x]=arr[indx1];
					x++;
					indx1++;
				}
				else{
					new_arr[x]=arr[indx2];
					indx2++;
					x++;
				}
			}
			while(indx1<=mid){
				new_arr[x]=arr[indx1];
				x++;
				indx1++;
			}
			while(indx2<=ei){
				new_arr[x]=arr[indx2];
				x++;
				indx2++;
			}
			for( i=0,j=si; i<new_arr.length; i++,j++){
					arr[j]=new_arr[i];
			}
	}
	public static void divide(int arr[],int si,int ei){
		if(si<ei){
			int mid=si+(ei-si)/2;
			divide(arr,si,mid);
			divide(arr,mid+1,ei);
			conquer(arr,si,mid,ei);
		}
	}
	
	public static void main(String args[]){
		int arr[]={10,8,9,4,3};
		int n=arr.length;
		divide(arr,0,n-1);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+"\t");
		}

		//System.out.println("hello Robot");
	}

}
