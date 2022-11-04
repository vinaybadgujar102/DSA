import java.util.Arrays;

public class BubbleSortRecur {
    public static void main(String[] args) {
        int[] array = {2,1,3,1,6,5};
        bubblesort(array, array.length-1, 0);
        System.out.println(Arrays.toString(array));
    }

    static void bubblesort(int[] arr, int r, int c){
        if(r == 0)  return;

        if(c<r){
            if(arr[c]>arr[c+1]){
                arr[c] = arr[c]^arr[c+1];
                arr[c+1] = arr[c]^arr[c+1];
                arr[c] = arr[c]^arr[c+1];
            }
            bubblesort(arr,r, c+1);
        }
        else{
            bubblesort(arr,r-1, 0);
        }
    }
}
