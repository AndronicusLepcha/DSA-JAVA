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
//Execution Stack
// Initial function call: Divide(arr, 0, 5)

//   Divide(arr, 0, 5)
//     - Calculates mid as 2: (0 + 5) / 2
//     - Calls Divide(arr, 0, 2)

//     Divide(arr, 0, 2)
//       - Calculates mid as 1: (0 + 2) / 2
//       - Calls Divide(arr, 0, 1)

//       Divide(arr, 0, 1)
//         - Calculates mid as 0: (0 + 1) / 2
//         - Calls Divide(arr, 0, 0)

//         Divide(arr, 0, 0)
//           - Base case reached (s == e); returns
//         End of Divide(arr, 0, 0)

//         - Calls Divide(arr, 1, 1)

//         Divide(arr, 1, 1)
//           - Base case reached (s == e); returns
//         End of Divide(arr, 1, 1)

//         conquer(arr, 0, 0, 1)
//           - Merging [6] and [3]
//           - Result: [3, 6]
//         End of conquer(arr, 0, 0, 1)
//       End of Divide(arr, 0, 1)

//       - Calls Divide(arr, 2, 2)

//       Divide(arr, 2, 2)
//         - Base case reached (s == e); returns
//       End of Divide(arr, 2, 2)

//       conquer(arr, 0, 1, 2)
//         - Merging [3, 6] and [1]
//         - Result: [1, 3, 6]
//       End of conquer(arr, 0, 1, 2)
//     End of Divide(arr, 0, 2)

//     - Calls Divide(arr, 3, 5)

//     Divide(arr, 3, 5)
//       - Calculates mid as 4: (3 + 5) / 2
//       - Calls Divide(arr, 3, 4)

//       Divide(arr, 3, 4)
//         - Calculates mid as 3: (3 + 4) / 2
//         - Calls Divide(arr, 3, 3)

//         Divide(arr, 3, 3)
//           - Base case reached (s == e); returns
//         End of Divide(arr, 3, 3)

//         - Calls Divide(arr, 4, 4)

//         Divide(arr, 4, 4)
//           - Base case reached (s == e); returns
//         End of Divide(arr, 4, 4)

//         conquer(arr, 3, 3, 4)
//           - Merging [5] and [2]
//           - Result: [2, 5]
//         End of conquer(arr, 3, 3, 4)
//       End of Divide(arr, 3, 4)

//       - Calls Divide(arr, 5, 5)

//       Divide(arr, 5, 5)
//         - Base case reached (s == e); returns
//       End of Divide(arr, 5, 5)

//       conquer(arr, 3, 4, 5)
//         - Merging [2, 5] and [8]
//         - Result: [2, 5, 8]
//       End of conquer(arr, 3, 4, 5)
//     End of Divide(arr, 3, 5)

//     conquer(arr, 0, 2, 5)
//       - Merging [1, 3, 6] and [2, 5, 8]
//       - Result: [1, 2, 3, 5, 6, 8]
//     End of conquer(arr, 0, 2, 5)
//   End of Divide(arr, 0, 5)

// End of the initial function call: Divide(arr, 0, 5)

