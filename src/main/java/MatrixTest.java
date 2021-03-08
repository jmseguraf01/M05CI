import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @org.junit.jupiter.api.Test
    void getWidth() {
        int width = 5;
        int height = 5;
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getWidth_OK() {
        int width = 5;
        int height = 5;
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }
    @org.junit.jupiter.api.Test
    void getWidth_NEGATIVE() {
        int width = -1;
        int height = 5;
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Matrix(width, height);
        });
    }


}