package _java.unidad9.teoria.herencia;

public class Cylinder extends Circle{

	private double height;

	public Cylinder() {
		this(1.0);
	}

	public Cylinder(double height) {
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume(){
		return super.getArea() * height;
	}

	@Override
	public String toString() {
		return "Cylinder{Altura=" + height + ", " + super.toString() + "}";
	}
}
