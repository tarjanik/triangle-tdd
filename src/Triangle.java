import javax.naming.NamingException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Line> getLines() {
        return Arrays.asList(new Line(point1,point2), new Line(point2,point3), new Line(point3, point1));
    }

    public List<Line> getLinesTouching(Point point) {
        return getLines().stream().filter(line-> line.getPoints().contains(point)).collect(Collectors.toList());
    }
}
