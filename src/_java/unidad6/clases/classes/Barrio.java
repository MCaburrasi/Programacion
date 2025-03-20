package _java.unidad6.clases.classes;

import java.util.HashSet;
import java.util.Set;

public class Barrio {
	private String nombre;
	private Set<AparcaBicicletas> aparcaBicicletas;

	public Barrio(String nombre) {
		this(nombre, new HashSet<>());
	}

	public Barrio(String nombre, Set<AparcaBicicletas> aparcaBicicletas) {
		this.nombre = nombre;
		this.aparcaBicicletas = aparcaBicicletas;
	}

	public Set<AparcaBicicletas> getAparcaBicicletas() {
		return aparcaBicicletas;
	}

	public String getCant() {
		return nombre;
	}
}
