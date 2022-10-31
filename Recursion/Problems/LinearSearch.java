import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int target = 5;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linearSearch2(arr, target, 0));
        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
    }

    //returns boolean
    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length) return false;

        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    //returns index
    static int linearSearch2(int[] arr, int target, int index){
        if(index == arr.length) return -1;

        if(arr[index]==target){
            return index;
        }
        else{
            return linearSearch2(arr, target, index + 1);
        }
    }

    //finds and stores the index of target element in Arraylist
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length) return list;

        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);

    }
}