package _java.unidad9.teoria.test;

import _java.unidad9.teoria.enums.Equipo;

public class PruebaEquipo {
	public static void main(String[] args) {
		Equipo villareal = Equipo.VILLAREAL;
		System.out.println("villareal.name()= " + villareal.name());
		System.out.println("villareal.getNombreClub()= " + villareal.getNombreClub());
		System.out.println("villareal.getPuestoLiga()= " + villareal.getPuestoLiga());
	}
}
