package _java.unidad9.teoria.herencia;

import _java.unidad9.teoria.classes.Punto;

public class LineSub extends Punto {
	private Punto end;

	public LineSub(int x1, int y1, int x2, int y2) {
		super(x1, y2);
		this.end = new Punto(x2, y2);
	}

	public LineSub(Punto begin, Punto end) {
		this(begin.getX(), begin.getY(), end.getX(), end.getY());
	}

//	public Punto getBegin() {
//		//return this????
//		return super.get;
//	}

	public Punto getEnd() {
		return end;
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public int[] getEndXY() {
		return end.getXY();
	}

	public int getBeginX() {
		return super.getX();
	}

	public int getBeginY() {
		return super.getY();
	}

	public int[] getBeginXY() {
		return super.getXY();
	}

	public void setEnd(Punto end) {
		this.end = end;
	}

	public void setEndX(int x) {
		this.end.setX(x);
	}

	public void setEndY(int y) {
		this.end.setY(y);
	}

	public void setEndXY(int x, int y) {
		this.end.setXY(x, y);
	}

	public void setBeginX(int x) {
		super.setX(x);
	}

	public void setBeginY(int y) {
		super.setY(y);
	}

	public void setBeginXY(int x, int y) {
		super.setXY(x, y);
	}
}
