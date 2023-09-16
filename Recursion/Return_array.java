import java.util.ArrayList;

// arr=[1,2,3,4,5,4] key=4
// ans=[3,5]

public class Return_array {
    public static void main(String[] args) {
        //ArrayList<Integer> list= new ArrayList<>();
        int[] arr={1,3,4,4,6};
        int key=4;
        //findIndex(arr,key,0,list);
        System.out.println(findIndex2(arr,key,0));
    }
    static ArrayList<Integer> findIndex(int arr[],int key,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==key){
            list.add(index);
        }

        return findIndex(arr, key, index+1, list);   
    }
    static ArrayList<Integer> findIndex2(int arr[],int key,int index){
        ArrayList<Integer> list= new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        //ans for that function call only
        if(arr[index]==key){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow= findIndex2(arr, key, index+1);   
        list.addAll(ansFromBelow);
        return list;

    }


}
