import java.util.Arrays;

public class RemoveDupFrmSortedArray {

    //Leetcode - 26
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        int index = 0;
        int newIndx = 0;

        while(index < length){
            if(nums[index] > nums[newIndx]){
                newIndx++;
                nums[newIndx] = nums[index];
            }
            index++;
        }

        return newIndx+1;
    }

    public static void main(String[] args) {
        RemoveDupFrmSortedArray removeDupFrmSortedArray = new RemoveDupFrmSortedArray();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = new int[]{1,2,0};
        int k = removeDupFrmSortedArray.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
