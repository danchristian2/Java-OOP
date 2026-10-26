package collections;

public class Point<T> {
    private T x;
    private T y;
    public Point() {}
    public Point(T x,T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public<D extends Number> void setX(D x) {
        this.x = (T)x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
