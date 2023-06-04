
import java.util.Arrays;

class Prob1 {
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(a)));
    }
    public static int[] moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                
                lastNonZeroIndex++;
            }
        }
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
