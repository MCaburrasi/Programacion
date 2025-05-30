package _java.unidad6.clases.classes;

public class Parking implements Comparable<Parking>{
	private double x;
	private double y;
	private int id;
	private District district;
	private int rings;
	private String installed;

	public Parking(double x, double y, int id, District district, int rings, String installed) {
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

	public String makePretty(){
		return "Aparcabicicleta " + this.id + "\nCoordenadaX: " + this.x + "\nCoordenadaY: " + this.y + "\nAros: " + rings + "\nInstalado: " + installed;
	}

	@Override
	public int compareTo(Parking o) {
		return Integer.compare(this.id, o.id);
	}

	@Override
	public String toString() {
		return "\nAparcaBicicletas[" + "x=" + x + ", y=" + y + ", id=" + id + ", rings=" + rings + ", barrio=" + district.getName() + ", installed='" + installed +']';
	}
}
