import java.util.Scanner;

import java.util.*;
public class accenture1 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={1,2,3,4,6,6,7,8,9,10};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                System.out.println("Unique elemt "+arr2[i]);
            }
        }

        //input from terminal
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elemnt for array 1 ");
        int arr=sc.nextInt();
        System.out.println(arr);
    }
   
}
