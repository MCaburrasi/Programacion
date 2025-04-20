package _java.unidad9.teoria.herencia;

public class Circle2 extends Shape{
	private double radius;

	public Circle2(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public Circle2(double radius) {
		super();
		this.radius = radius;
	}

	public Circle2() {
		this(1.0);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 2 * Math.PI * radius;
	}

	public double getPerimeter() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Un circulo con radio = " + radius + ", que es subclase de" + super.toString();
	}
}
