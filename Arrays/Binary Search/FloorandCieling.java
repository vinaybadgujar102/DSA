public class FloorandCieling {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target = 3;
        System.out.println(floor(arr,target));
        System.out.println(ceiling(arr,target));
    }

    //to get the highest number which is lower than target(i.e.floor) return end in binary search instead of -1
    //when element is not found
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }

    //to get the lowest number which is higher than target(i.e.floor) return end in binary search instead of -1
    //when element is not found
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
