import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,6,2,9,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] nums){
        boolean isSorted;

        for (int i = 0; i < nums.length ; i++) {
            isSorted=false;
            for(int j=1; j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    isSorted=true;
                }
            }
            if(!isSorted){
                break;
            }
        }
    }
}
