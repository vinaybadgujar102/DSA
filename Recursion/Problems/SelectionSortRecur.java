import java.util.Arrays;

public class SelectionSortRecur {
    public static void main(String[] args) {
        int[] array = {2,1,3,1,6,5};
        selectionsort(array, array.length-1, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    static void selectionsort(int[] arr, int r, int c, int max){
        if(r == 0)  return;

        if(c<r){
            if(arr[c]>arr[max]){
                selectionsort(arr, r, c+1, c);
            }else
            selectionsort(arr,r, c+1, max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr,r-1, 0,0);
        }
    }
}
