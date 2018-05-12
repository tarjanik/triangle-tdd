import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void triangleTest() {
        // Draw a triangle with points (2,1) (5,6) (8,4)
        // Verify that points are (2,1) (5,6) (8,4)
        Triangle triangle = new Triangle (new Point(2,1),new Point(5,6), new Point(8,4));
        assertEquals(triangle.getPoints().toString(),"[(2.0),(1.0), (5.0),(6.0), (8.0),(4.0)]");
    }
}
