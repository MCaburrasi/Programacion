package _java.unidad9.teoria.enums;

public enum Equipo {
	BARCA("FC Barcelona", 1), REAL_MADRID("Real Madrid", 2), SEVILLA("Sevilla FC", 4), VILLAREAL("Villareal", 7);

	private String nombreClub;
	private int puestoLiga;

	Equipo(String nombreClub, int puestoLiga) {
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}

	@Override
	public String toString() {
		return "Equipo[" + "nombreClub= " + nombreClub + "]";
	}
}
