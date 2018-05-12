public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)",x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Point){
            Point other = (Point) obj;
            // TODO: Don't check double for equality
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }
}
