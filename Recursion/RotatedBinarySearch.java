public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,1,2,3};
        int end=arr.length;
        System.out.println(search(arr,7, 0, end-1));
    }
    static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+end/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){ //it must be sorted
            if(target >=arr[start] && target<=arr[mid]){
                return search(arr, target, start, mid-1);
            }else{
                return search(arr, target, mid+1, end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return search(arr, target, mid+1, end);
        }
        return search(arr, target, start, mid-1);
    }
}
