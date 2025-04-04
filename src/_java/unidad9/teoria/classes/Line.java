package _java.unidad9.teoria.classes;

import java.awt.*;

public class Line {
	Point begin, end;

	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	public Line(int x1, int y1, int x2, int y2){
		this(new Point(x1, y2), new Point(x2, y2));
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public Point getBeginX() {
		return begin;
	}

	public void setBeginX(Point begin) {
		this.begin = begin;
	}

	public Point getBeginY() {
		return begin;
	}

	public void setBeginY(Point begin) {
		this.begin = begin;
	}
}
