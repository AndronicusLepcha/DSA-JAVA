package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={7,3,5,2,1};
        Selectsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selectsort(int arr[],int r,int c,int max){
        if(r==0){
            return; 
        }
        if(c<r){
            if(arr[c]>arr[max]){
                Selectsort(arr, r, c+1, c);
            }else{
                Selectsort(arr, r, c+1, max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            Selectsort(arr, r-1, 0, 0);
            
        }

    }
}
