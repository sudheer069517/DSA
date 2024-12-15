import javax.xml.transform.Source;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class RemoveElement {

    //Leetcode - 27
    public int removeElement(int[] nums, int val) {

        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            if (nums[i] == val){
                if(nums[i] != nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
                j--;
            }else{
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = new int[]{2, 2, 0, 0}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
