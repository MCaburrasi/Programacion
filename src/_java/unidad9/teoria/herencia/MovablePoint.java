package _java.unidad9.teoria.herencia;

public class MovablePoint extends Point{
	private float xSpeed;
	private float ySpeed;

	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public MovablePoint() {
		this(0.0f, 0.0f);
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public float[] getSpeed() {
		return new float[] {xSpeed, ySpeed};
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void setSpeed(float xSpeed, float ySpeed) {
		setxSpeed(xSpeed);
		setySpeed(ySpeed);
	}

	public MovablePoint move (){
		super.setX(getX() + xSpeed);
		super.setY(getY() + ySpeed);
		return this;
	}

	@Override
	public String toString() {
		return super.toString() + ", speed=(" + xSpeed + " " + ySpeed + ")";
	}
}
