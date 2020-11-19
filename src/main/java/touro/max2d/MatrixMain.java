package touro.max2d;

public class MatrixMain {
    public static void main(String[] args) {
        MatrixInputReader inputReader = new MatrixInputReader(args[0]);

        Matrix matrix = new Matrix(inputReader.getMatrix());
        int maxSum = matrix.getMaxSum();

        System.out.println("Max sum for matrix: " + maxSum);
    }
}
