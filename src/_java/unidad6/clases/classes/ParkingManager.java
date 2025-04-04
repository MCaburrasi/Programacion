package _java.unidad6.clases.classes;

import java.util.Set;
import java.util.TreeSet;

public class ParkingManager {
	private Set<District> district;

	public ParkingManager() {
		this.district = new TreeSet<>();
	}

	public Set<District> getDistrict() {
		return district;
	}

	public int getQuant(District district) {
		return district.getParking().size();
	}

	public int getQuantInstalled(District district){
		int i = 0;
		for (Parking park : district.getParking()){
			if (park.getInstalled().equals("SI")){
				i++;
			}
		}
		return i;
	}

	private Set<Parking> makeParkingSet() {
		Set<Parking> parkingSet = new TreeSet<>();
		for (District dist : district){
			parkingSet.addAll(dist.getParking());
		}
		return parkingSet;
	}

	public void reportPrint (){
		for (District dist : district) {
			System.out.println("Barrio: " + dist.getName());
			System.out.println("Cantidad de aparcabicicletas: " + getQuant(dist));
			System.out.println("Aparcabicicletas instalados: " + getQuantInstalled(dist));
			for (Parking park : dist.getParking()){
				System.out.println(park.makePretty());
				System.out.println("-----------------------");
			}
			System.out.println(" ");
		}
	}

	public void parkingPrint (){
		Set<Parking> parkingSet = makeParkingSet();
		parkingSet.forEach(System.out::println);
	}
}

