public class MatrixDiagonalSum {
    // leet code : 1572
    public int diagonalSum(int[][] mat) {

        int length = mat.length;
        int sum = 0;

        //Adding primary diagonal
        for(int i = 0; i < length; i++)
            sum+= mat[i][i];

        //Adding secondary diagonal
        for(int i = 0; i < length; i++)
            sum+= mat[i][length-1-i];

        //removing duplicate when the dimension is odd
        if(length % 2 > 0){
            int center = length / 2;
            sum-= mat[center][center];
        }

        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        int sum = matrixDiagonalSum.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(sum);
    }
}
