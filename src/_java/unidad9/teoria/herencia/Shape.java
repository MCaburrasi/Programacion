package _java.unidad9.teoria.herencia;

public class Shape {
	private String color;
	private boolean filled;

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public Shape() {
		this("red", true);
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape[" + "color=" + color + ", filled=" + filled + ']';
	}
}
