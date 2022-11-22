import java.util.Arrays;

public class FirstandLastOccurrence_34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        //used binary search two times: 1st to get first index, 2nd to get last index
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }

    static int binarySearch(int[] nums, int target, boolean isFirst){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else{
                //index stores that mid may be the ans, but there also can be the at prevoius and nex index
                //this is determined using given if-else condition
                index = mid;
                if(isFirst){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return index;
        }
}
