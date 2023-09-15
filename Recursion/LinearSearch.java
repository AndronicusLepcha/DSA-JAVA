public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,23,32,44,12,50};
        int key=44;
        //searchKey(arr,key,0);
        System.out.println(searchKeyIndex(arr,key,0));
    }
    static void searchKey(int arr[],int key,int index){
        if(index == arr.length-1){
            return;
        }
        if(key==arr[index]){
            System.out.println("Element is in index "+index);
            return;
        }
        searchKey(arr, key, index+1);
    }
    static int searchKeyIndex(int arr[],int key,int index){
        if(index == arr.length-1){
            return 0;
        }
        if(key==arr[index]){
            //System.out.println("Element is in index "+index);
            return index;
        }
        return searchKeyIndex(arr, key, index+1);
    }
}
