public class Triangle extends Shape {
    private double side1 = 1.0f;
    private double side2 = 1.0f;
    private double side3 = 1.0f;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return Math.sqrt(getHalfPerimeter() *
                (getHalfPerimeter() - side1) *
                (getHalfPerimeter() - side2) *
                (getHalfPerimeter() - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getHalfPerimeter() {
        return  ((side1 + side2 + side3) * 0.5);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" +
                "triangle area = " +
                getArea() +
                "\n" +
                "triangle perimeter = " +
                getPerimeter();
    }
}
