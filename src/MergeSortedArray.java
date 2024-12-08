import java.util.Arrays;

public class MergeSortedArray {

    //Leet code - 88
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //merging
        for(int i = m, j = 0; i < m+n && j < n; i++, j++){
            nums1[i] = nums2[j];
        }

        // Typical sorting using temp variable
        for(int i = 0; i < nums1.length ; i++){
            for(int j = i; j < nums1.length; j++){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }

        // Alternative to above loop
        //Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
