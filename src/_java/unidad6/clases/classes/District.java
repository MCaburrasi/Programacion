package _java.unidad6.clases.classes;

import java.util.HashSet;
import java.util.Set;

public class District {
	private String name;
	private Set<Parking> parking;

	public District(String name) {
		this(name, new HashSet<>());
	}

	public District(String name, Set<Parking> parking) {
		this.name = name;
		this.parking = parking;
	}

	public String getName() {
		return name;
	}

	public Set<Parking> getParking() {
		return parking;
	}

	public String getCant() {
		return name;
	}
}
