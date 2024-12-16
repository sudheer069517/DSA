import java.util.Arrays;

public class RotateImage {

    //Leetcode - 48
    public void rotate(int[][] matrix) {

        int temp = 0;

        //transpose matrix
        for(int i = 0; i < matrix.length ; i++) {
            for (int j = i; j < matrix.length ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row
        for(int k = 0; k < matrix.length ; k++){
            int m = 0;
            int n = matrix.length-1;
            while(m < n){
                temp = matrix[k][m];
                matrix[k][m] = matrix[k][n];
                matrix[k][n] = temp;
                m++;
                n--;
            }
       }
    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage.rotate(matrix);
    }
}
