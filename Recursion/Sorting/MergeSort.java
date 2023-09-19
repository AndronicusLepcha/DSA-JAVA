package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={6,3,1,5,2,8};
        Divide(arr,0,arr.length-1);
        //int mix[]=new int[arr.length-1];
        System.out.println(Arrays.toString(arr));
    }
    static void Divide(int arr[],int s,int e){
        if(s==e){
            return;
        }
         
            int mid=(s+e)/2;
            
            Divide(arr,0,mid); 
            Divide(arr,mid+1,e);
            conquer(arr,s,mid,e);
    }
    static void conquer(int[] arr,int s,int mid,int e){
        int[] mix=new int[e-s+1];
        int id1=s;
        //int id2=0;
        int id2=mid+1;
        int k=0;
        while(id1<=mid && id2<=e){
            if(arr[id1]<arr[id2]){
                mix[k]=arr[id1];
                id1++;
            }else{
                mix[k]=arr[id2];
                id2++;
            }
            k++;
        }
        while(id1<=mid){
            mix[k]=arr[id1];
            id1++;
            k++;
        }
        while(id2<=e){
            mix[k]=arr[id2];
            id2++;
            k++;
        }
        System.out.println(Arrays.toString(mix));
        for(int i=0;i<mix.length;i++){
            arr[s+i] = mix[i];
        }

    } 
    
}
