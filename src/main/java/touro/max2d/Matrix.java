package touro.max2d;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    //algorithm inspired by https://prismoskills.appspot.com/lessons/Dynamic_Programming/Chapter_07_-_Submatrix_with_largest_sum.jsp
    public int getMaxSum() {
        if (matrix.length == 0) return 0;

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int maxSum = 0;

        for (int currentStartCol = 0; currentStartCol < numCols; currentStartCol++) {
            int[] tempArray = new int[numRows];

            for (int currentEndCol = currentStartCol; currentEndCol < numCols; currentEndCol++) {

                for (int currentRow = 0; currentRow < numRows; currentRow++) {
                    tempArray[currentRow] += matrix[currentRow][currentEndCol];
                }

                int sum = kadane(tempArray);
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    //algorithm inspired by https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
    public int kadane(int[] tempArray) {
        int maxSoFar = tempArray[0];
        int currMax = tempArray[0];

        for (int val : tempArray) {
            currMax = Math.max(val, currMax + val);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}
