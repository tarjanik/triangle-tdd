import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void horizontalLineTest(){
        // #Scenario 1_dist.jpg [1]
        // Draw a line from (0,0) to (5,0)
        // Verify: length of the line is 5
        Line line = new Line(new Point(0,0), new Point(0,5));
        assertEquals(line.getLength(),5.0,0.00001);
    }
}
