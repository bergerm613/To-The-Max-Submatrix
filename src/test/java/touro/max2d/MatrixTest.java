package touro.max2d;

import org.junit.Test;
import touro.max2d.Matrix;

import static org.junit.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void getMaxSum() {
        //given
        int[][] input = {{0,-2,-7,0}, {9,2,-6,2}, {-4,1,-4,1}, {-1,8,0,-2}};
        Matrix matrix = new Matrix(input);

        //when
        int solution = matrix.getMaxSum();

        //then
        assertEquals(solution, 15);
    }
}