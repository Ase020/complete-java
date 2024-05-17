import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    void areaOfSquare() {
        assertEquals(25, shape.areaOfSquare(5));
    }

    @Test
    void areaOfCircle() {
        assertEquals(153.86, shape.areaOfCircle(7), "Are of circle not correct!");
    }
}