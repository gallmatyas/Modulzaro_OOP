package shape;

class Square extends GeometriaiForma {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }
}