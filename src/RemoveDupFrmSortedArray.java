import java.util.Arrays;

public class RemoveDupFrmSortedArray {

    //Leetcode - 26
    public int removeDuplicates(int[] nums) {

        int length = nums.length;
        int index = 0;
        int[] newArr = new int[length];
        int newArrIndx = 0;

        while(index < length){
            if(index == 0){
                newArr[newArrIndx] = nums[index];
                newArrIndx++;
            }else{
                if(nums[index] != newArr[newArrIndx-1]){
                    newArr[newArrIndx] = nums[index];
                    newArrIndx++;
                }
            }
            index++;
        }

        System.out.println(Arrays.toString(newArr));
        return newArrIndx;
    }

    public static void main(String[] args) {
        RemoveDupFrmSortedArray removeDupFrmSortedArray = new RemoveDupFrmSortedArray();
        int length = removeDupFrmSortedArray.removeDuplicates(new int[]{1,1,2});
        System.out.println(length);
    }
}
