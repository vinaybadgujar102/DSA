public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linearSearch2(arr, target, 0));
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
}
