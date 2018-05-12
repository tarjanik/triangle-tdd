import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Line {

    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength() {
        double xDiff = endPoint.getX() - startPoint.getX();
        double yDiff = endPoint.getY() - startPoint.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


    public List<Point> getPoints() {
        return Arrays.asList(startPoint, endPoint);
    }

    @Override
    public String toString() {
        return String.format("Line with start point: %s, end point %s", startPoint, endPoint);
    }
}
