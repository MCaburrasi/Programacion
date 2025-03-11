package _java.unidad6.clases;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0, "rojo");
    }

    public Circle(double radius) {
        this(radius, "rojo");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(Circle circle) {
        this(circle.radius, circle.color);
    }

    public double getRadio() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Circulo [Radio: %.2f, Color: %s", radius, color);
    }
}
