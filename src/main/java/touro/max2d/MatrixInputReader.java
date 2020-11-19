package touro.max2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixInputReader {

    private int matrix[][];

    public MatrixInputReader(String fileName) {
        try {
            Scanner inputFile = new Scanner(new File(fileName));
            int matrixSize = Integer.parseInt(inputFile.next());

            matrix = new int[matrixSize][matrixSize];

            while (inputFile.hasNext()) {
               for (int row = 0; row < matrixSize; row++) {
                   for (int col = 0; col < matrixSize; col++) {
                       matrix[row][col] = Integer.parseInt(inputFile.next());
                   }
               }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
