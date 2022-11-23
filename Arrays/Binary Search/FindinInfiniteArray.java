import java.util.Arrays;

public class FindinInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;

        //starting with range of 2 elements, if target element is not present in two elements (if target>arr[end]
        //we double the range by: start=end+1;
        //                        end=end+(end-start+1)*2;
        while(target>nums[end]){
            int temp=end+1;
            end = end + (end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
