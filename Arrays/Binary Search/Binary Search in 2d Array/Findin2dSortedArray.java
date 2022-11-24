import java.util.Arrays;

//Find element in matrix where row and columns are sorted
public class Findin2dSortedArray {
    public static void main(String[] args) {
        int[][] nums = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,58}
        };
        System.out.println(Arrays.toString(findElement(nums, 58)));
    }

    static int[] findElement(int[][] nums, int target){
        int r=0;
        int c= nums.length-1;

        while(r< nums.length && c>=0){
            if(target==nums[r][c]){
                return new int[]{r,c};
            }
            if(nums[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
