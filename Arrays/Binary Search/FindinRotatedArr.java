public class FindinRotatedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target= 10;
        System.out.println(search(arr, target));
    }

    //find the logic behind the solution by find edge cases and then implement it.
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(nums[pivot]==target){
            return pivot;
        }
        if(pivot==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(target>=nums[0]){
                return binarySearch(nums, target, 0, pivot-1);
        }
            return binarySearch(nums, target, pivot+1, nums.length-1);

    }


    //first we have to find pivot(largest element in arr), below are the conditions for the same
    //dry run and try to debug and understand each condition to fully understand the thought process.
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]<=nums[start]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
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
