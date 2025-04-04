package _java.unidad9.teoria.classes;

public class Punto {
	private int x, y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
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

	public int[] getXY(){
		int[] result = new int[2];
		result[0] = this.x;
		result[1] = this.y;
		return result;
	}

	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y){
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance(Punto another){
		return distance(another.x, another.y);
	}

	public double distance(){
		return distance(0, 0);
	}
}
