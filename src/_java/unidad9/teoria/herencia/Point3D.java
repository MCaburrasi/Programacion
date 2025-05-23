package _java.unidad9.teoria.herencia;

public class Point3D extends Point2D{
	private int z;

	public Point3D() {
		this.z = 0;
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D(" + super.getX() + ", " + super.getY() + ", " + z + ')';
	}
}
