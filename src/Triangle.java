import java.util.Arrays;
import java.util.List;

public class Triangle {
    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public List<Point> getPoints() {
        return Arrays.asList(point1, point2, point3);
    }
}
