import java.util.*;
import java.util.Scanner;
class binary_search{
	public static void main(String[] args){
		//String arg1=args[0]; 
		//System.out.println("argument is "+arg1);

		int arr[]={1,2,3,4,5,6};
		int n=arr.length;
		int key=9;
		int si,ei,mid;
		si=0;
		ei=n-1;
		//binary search
		while(si<=ei){
			mid=si+(ei-si)/2;
			if(arr[mid]==key){
				System.out.println("element found at index "+mid);
				System.exit(0);
			}
			if(key>arr[mid]){
				si=mid+1;
			}
			else{
				ei=mid-1;
			}
		}
		System.out.println("no found");
	}

}
