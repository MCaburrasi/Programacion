package _java.unidad9.teoria.classes;

public class Circle {
	private Punto center;
	private double radius;

	public Circle(){
		this(0, 0, 1.0);
	}

	public Circle(int xCenter, int yCenter, double radius) {
		this.center = new Punto(xCenter, yCenter);
		this.radius = radius;
	}

	public Circle(Punto point, double radius){
		this(point.getX(), point.getY(), radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Punto getCenter() {
		return center;
	}

	public void setCenter(Punto center) {
		this.center = center;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int xCenter) {
		this.center.setX(xCenter);
	}

	public Punto getCenterY() {
		return center;
	}

	public void setCenterY(int yCenter) {
		this.center.setY(yCenter);
	}

	public int[] getCenterXY() {
		return new int[]{center.getX(), center.getY()};
	}

	public void setCenterXY(int xCenter, int yCenter) {
		setCenter(new Punto(xCenter, yCenter));
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference(){
		return 2 * Math.PI * radius;
	}

	public double distance(Circle aCircle){
		return center.distance(aCircle.center);
	}

	@Override
	public String toString() {
		return "Circle[" + "Center=" + center + ", radius=" + radius + ']';
	}

}
