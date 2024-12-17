import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //Leetcode - 54
    public List<Integer> spiralOrder(int[][] matrix) {

        int rowsLength = matrix.length;
        int columnLength = matrix[0].length;
        int right = columnLength;
        int left = 0;
        int bottom = rowsLength;
        int top = 0;
        List<Integer> spiralList = new ArrayList<>();

        int count = 0;

        while(count < (rowsLength * columnLength)){

            //from left to right
            for(int r = left; r < right; r++){
                spiralList.add(matrix[left][r]);
                top++;
                count++;
            }

            //from top to bottom
            for(int t = top; t < bottom ; t++){
                spiralList.add(matrix[t-1][top]);
                count++;
                right--;
            }

            //from right to left
            for(int l = right; l > left; l--){
                spiralList.add(matrix[right][l]);
                count++;
                bottom--;
            }

            //from bottom to top
            for(int b = bottom; b > top; b--){
                spiralList.add(matrix[b][bottom]);
                count++;
                left++;
            }

        }

        return spiralList;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> spiralList = spiralMatrix.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        System.out.print(spiralList);
    }


}
