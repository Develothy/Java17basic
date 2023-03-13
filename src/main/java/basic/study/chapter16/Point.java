package basic.study.chapter16;

class Point {

    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() {
        return x;
    }
    int y() {
        return y;
    }

    public boolean equals(Object other) {
        if (other instanceof Point == false) return false;
        return ((Point)other).x == x && ((Point)other).y == y;
    }

    public int hashCode() {
        return y * 10000 + x;
    }

    public String toString() {
        return "PointRecord(" + x + ", " + y + ")";
    }
}
