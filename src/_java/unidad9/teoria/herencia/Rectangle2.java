package _java.unidad9.teoria.herencia;

public class Rectangle2 extends Shape{
	private double length;
	private double width;

	public Rectangle2() {
		this(1.0, 1.0);
	}

	public Rectangle2(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle2(String color, boolean filled, double length, double width) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
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
		return "Rectangle[" + super.toString() + " length=" + length + ", width=" + width + ']';
	}
}
