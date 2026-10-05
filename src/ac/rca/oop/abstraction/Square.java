package ac.rca.oop.abstraction;

public class Square implements Shape{
    private int side;
    public Square() {}


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;

    }

    @Override
    public double area() {
        return side * side ;
    }
    @Override
    public void print(){};
}
