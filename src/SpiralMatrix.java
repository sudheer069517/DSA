import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    //Leetcode - 54
    public List<Integer> spiralOrder(int[][] matrix) {

        int rowsLength = matrix.length;
        int columnLength = matrix[0].length;
        int right = columnLength-1;
        int left = 0;
        int bottom = rowsLength-1;
        int top = 0;
        List<Integer> spiralList = new ArrayList<>();

        int count = 0;

        while(count < (rowsLength * columnLength)){

            //from left to right
            for(int col = left; col <= right; col++){
                spiralList.add(matrix[left][col]);
                count++;
            }

            //from top to bottom
            for(int row = top + 1 ; row <= bottom ; row++){
                spiralList.add(matrix[row][right]);
                count++;
            }

            //from right to left
            if(bottom != top) {
                for(int col = right-1; col >= left; col--){
                    spiralList.add(matrix[bottom][col]);
                    count++;
                }
            }

            //from bottom to top
            if(left != right) {
                for (int row = bottom - 1; row > top ; row--) {
                    spiralList.add(matrix[row][left]);
                    count++;
                }
            }

            top++;
            left++;
            bottom--;
            right--;
        }

        return spiralList;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> spiralList = spiralMatrix.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8}, {9,10,11,12}});
        System.out.print(spiralList);
    }


}
