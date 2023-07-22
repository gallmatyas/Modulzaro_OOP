package shape;

class Circle extends GeometriaiForma {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    public double area() {
        return radius * radius * Math.PI;
    }
}
