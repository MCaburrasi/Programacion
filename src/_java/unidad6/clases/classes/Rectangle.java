package _java.unidad6.clases.classes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this(1.0f, 1.0f);
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "length=" + length + ", width=" + width + ']';
    }
}
