import java.util.ArrayList;
import java.util.List;

public class Subset {
    public List<List<Integer>> finalAnswer = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());

        return finalAnswer;
    }

    private void helper(int[] nums, int index, List<Integer> combFormedSoFar){

        if(index == nums.length){
            finalAnswer.add(new ArrayList<>(combFormedSoFar));
            return;
        }

        helper(nums, index+1, combFormedSoFar);

        combFormedSoFar.add(nums[index]);
        helper(nums, index+1, combFormedSoFar);
        combFormedSoFar.removeLast();
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        System.out.println(subset.subsets(new int[]{1,2,3}));
    }
}