package _java.unidad6.clases.classes;

import java.util.Set;
import java.util.TreeSet;

public class ParkingManager {
	private Set<District> district;
	private String name;

	public ParkingManager(String name) {
		this.name = name;
		this.district = new TreeSet<>();
	}

	public void report (District district){
		System.out.println(district.getName());
	}
}

