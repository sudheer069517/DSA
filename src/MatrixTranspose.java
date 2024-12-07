import java.util.Arrays;

public class MatrixTranspose {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[rows-1].length;
        int[][] newArray = new int[columns][rows];

        for(int i = 0; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                newArray[j][i] = matrix[i][j];
            }
        }

        return newArray;

    }

    public static void main(String[] args) {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrixTranspose.transpose(arr)));
    }
}
