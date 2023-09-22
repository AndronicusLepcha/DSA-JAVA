import java.util.*;
import java.util.Scanner;
class linear_search{
	public static void main(String args[]){
		int arr[]={23,5,67,7,2,4,8};
		int n,key=4;
		n=arr.length;
		//System.out.println("hello Robot");
		for(int i=0;i<n;i++){
			if(arr[i]==key){
				System.out.println(" element found in index "+i);
			}
		}
		
	}

}
