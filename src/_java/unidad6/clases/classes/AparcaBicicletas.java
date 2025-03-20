package _java.unidad6.clases.classes;

public class AparcaBicicletas {
	private double x;
	private double y;
	private int id;
	private Barrio district;
	private int rings;
	private String installed;

	public AparcaBicicletas(double x, double y, int id, Barrio district, int rings, String installed) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.district = district;
		this.rings = rings;
		this.installed = installed;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getId() {
		return id;
	}

	public int getRings() {
		return rings;
	}

	public String getInstalled() {
		return installed;
	}

	@Override
	public String toString() {
		return "\nAparcaBicicletas[" + "x=" + x + ", y=" + y + ", id=" + id + ", rings=" + rings + ", installed='" + installed + ']';
	}
}
