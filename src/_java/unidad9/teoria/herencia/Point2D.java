package _java.unidad9.teoria.herencia;

public class Point2D {
	private int x, y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point2D(Point2D point){
		this(point.x, point.y);
	}

	public Point2D() {
		this(0,0);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "("+ x + ", " + y + ')';
	}
}
