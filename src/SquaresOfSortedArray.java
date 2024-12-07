import java.util.Arrays;

public class SquaresOfSortedArray {

    //LeetCode 977

    public int[] sortedSquares(int[] nums) {

        //calculate sqaure
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            output[i] = nums[i] * nums[i];
        }

        //Using Inbuilt stream
        return Arrays.stream(nums).map( num -> {
            return num * num;
        }).sorted().toArray();


        //Iterate and sort by own
        /*for(int i = 0; i < output.length ; i++){
            for(int j = i+1; j < output.length ; j++){
                if(output[i] > output[j]){
                    int temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }

        return Arrays.stream(output).sorted().toArray();*/
    }

    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] output = squaresOfSortedArray.sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(output));
    }
}
