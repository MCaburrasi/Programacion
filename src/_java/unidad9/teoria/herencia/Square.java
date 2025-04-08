package _java.unidad9.teoria.herencia;

public class Square extends Rectangle2{
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	public Square(double side) {
		super(side, side);
	}

	public Square() {
		super();
	}

	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side){
		super.setLength(side);
		super.setWidth(side);
	}

	public void setWidth(double width){
		setSide(width);
	}

	public void setLength(double length){
		setSide(length);
	}

	@Override
	public String toString() {
		return "Square[" + super.toString() + "]";
	}
}
