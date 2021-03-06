import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void horizontalLineTest(){
        // #Scenario 1_dist.jpg [1]
        // Draw a line from (0,0) to (5,0)
        // Verify: length of the line is 5
        Line line = new Line(new Point(0,0), new Point(0,5));
        assertEquals(line.getLength(),5.0,0.00001);
    }

    @Test
    public void verticalLineTest(){
        // #Scenario 1_dist.jpg [2]
        // Draw a line from (0,0) to (0,4)
        // Verify: lenght of the line is 4
        Line line = new Line(new Point(0,0),new Point(0,4 ));
        assertEquals(line.getLength(),4.0,0.00001);
    }

    @Test
    public void generalLineTest(){
        // #Scenario 1_dist.jpg [3]
        // Draw a line from (1,3) to (5,6)
        // Verify: lenght of the line is 5
        Line line = new Line(new Point(1,3),new Point(5,6 ));
        assertEquals(line.getLength(),5.0,0.00001);
    }

    @Test
    public void getPointsTest(){
        // Draw a line from (1,2) to (3,4)
        // Verify, that endpoints are (1,2),(3,4)
        Line line = new Line(new Point(1,2),new Point(3,4 ));
        assertEquals(line.getPoints().toString(),"[(1.0, 2.0), (3.0, 4.0)]");
    }
}
