package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Parking;
import _java.unidad6.clases.classes.District;

public class TestAparcaBicicletas {
	public static void main(String[] args) {
		District cascoAntiguo = new District("Casco_Antiguo");

		Parking ca1 = new Parking(5.995101982988274,37.38900094875865,36, cascoAntiguo,4, "SI");
		cascoAntiguo.getParking().add(ca1);
		Parking ca2 = new Parking(5.994268346404604,37.397079331127095,44, cascoAntiguo,7, "SI");
		cascoAntiguo.getParking().add(ca2);
		Parking ca3 = new Parking(5.984516235680223,37.399101823666975,16,cascoAntiguo,5,"SI");
		cascoAntiguo.getParking().add(ca3);
		Parking ca4 = new Parking(5.986856346995355,37.399116096532588,17,cascoAntiguo,11,"SI");
		cascoAntiguo.getParking().add(ca4);
		Parking ca5 = new Parking(5.989313239297421,37.398184786353404,18,cascoAntiguo,5,"SI");
		cascoAntiguo.getParking().add(ca5);
		Parking ca6 = new Parking(5.990761323535414,37.395145280507116,19,cascoAntiguo,3,"SI");
		cascoAntiguo.getParking().add(ca6);
		Parking ca7 = new Parking(5.999120147254147,37.388126612743413,27,cascoAntiguo,4,"SI");
		cascoAntiguo.getParking().add(ca7);

		System.out.println(cascoAntiguo);
	}
}
