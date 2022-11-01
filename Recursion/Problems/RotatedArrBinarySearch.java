public class RotatedArrBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 7;
        System.out.println(rotatedArrBinarySearch(arr, 0, 0, arr.length-1));
    }

    public static int rotatedArrBinarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(target==arr[m]){
            return m;
        }

        if(arr[s]<=arr[m]){
            if (target >= arr[s] && target <=arr[m]){
                return rotatedArrBinarySearch(arr, target, s, m-1);
            } else{
                return rotatedArrBinarySearch(arr, target, m+1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return rotatedArrBinarySearch(arr, target, m+1, e);
        }
        return rotatedArrBinarySearch(arr, target, s, m-1);
    }
}
