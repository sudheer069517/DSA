import java.util.Arrays;

public class SpiralMatrix2 {

    //Leetcode - 59
    public int[][] generateMatrix(int n) {

        int[] normalArray = new int[n*n];
        for(int i = 0; i < n*n; i++){
            normalArray[i] = i+1;
        }

        return prepareSpiralList(normalArray, n);

    }


    private int[][] prepareSpiralList(int[] matrix, int n){

        int top = 0;
        int right = n - 1;
        int left = 0;
        int bottom = n - 1;
        int count = 0;
        int[][] finalArray = new int[n][n];

        while(count < n * n){

            // Left to right
            for(int col = left; col <= right; col++){
                finalArray[top][col] = matrix[count];
                count++;
            }

            // Top to Bottom
            for(int row = top + 1; row <= bottom ; row++){
                finalArray[row][right] = matrix[count];
                count++;
            }

            // Right to Left
            if(left != right){
                for(int col = right - 1; col >= left; col--){
                    finalArray[bottom][col] = matrix[count];
                    count++;
                }
            }

            // Bottom to Top
            if(top != bottom){
                for(int row = bottom - 1; row > top ; row--){
                    finalArray[row][left] = matrix[count];
                    count++;
                }
            }

            left++;
            top++;
            right--;
            bottom--;
        }

        System.out.print(Arrays.deepToString(finalArray));

        return finalArray;

    }

    public static void main(String[] args) {
        SpiralMatrix2 spiralMatrix2 = new SpiralMatrix2();
        System.out.print(Arrays.deepToString(spiralMatrix2.generateMatrix(3)));
    }
}
