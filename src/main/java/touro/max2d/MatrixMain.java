package touro.max2d;

public class MatrixMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please give a filename as argument.");
        }
        else {
            MatrixInputReader inputReader = new MatrixInputReader(args[0]);

            Matrix matrix = new Matrix(inputReader.getMatrix());
            int maxSum = matrix.getMaxSum();

            System.out.println("Max sum for matrix: " + maxSum);
        }

    }
}
