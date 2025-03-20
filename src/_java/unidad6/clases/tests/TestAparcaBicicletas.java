package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.AparcaBicicletas;
import _java.unidad6.clases.classes.Barrio;

public class TestAparcaBicicletas {
	public static void main(String[] args) {
		Barrio cascoAntiguo = new Barrio("Casco_Antiguo");

		AparcaBicicletas ca1 = new AparcaBicicletas(5.995101982988274,37.38900094875865,36, cascoAntiguo,4, "SI");
		cascoAntiguo.getAparcaBicicletas().add(ca1);
		AparcaBicicletas ca2 = new AparcaBicicletas(5.994268346404604,37.397079331127095,44, cascoAntiguo,7, "SI");
		cascoAntiguo.getAparcaBicicletas().add(ca2);
		AparcaBicicletas ca3 = new AparcaBicicletas(5.984516235680223,37.399101823666975,16,cascoAntiguo,5,"SI");
		cascoAntiguo.getAparcaBicicletas().add(ca3);
		AparcaBicicletas ca4 = new AparcaBicicletas(5.986856346995355,37.399116096532588,17,cascoAntiguo,11,"SI");
		cascoAntiguo.getAparcaBicicletas().add(ca4);
		AparcaBicicletas ca5 = new AparcaBicicletas(5.989313239297421,37.398184786353404,18,cascoAntiguo,5,"SI");
		cascoAntiguo.getAparcaBicicletas().add(ca5);
		AparcaBicicletas ca6 = new AparcaBicicletas(5.990761323535414,37.395145280507116,19,cascoAntiguo,3,"SI");
		cascoAntiguo.getAparcaBicicletas().add(ca6);
		AparcaBicicletas ca7 = new AparcaBicicletas(5.999120147254147,37.388126612743413,27,cascoAntiguo,4,"SI");
		cascoAntiguo.getAparcaBicicletas().add(ca7);

		System.out.println(cascoAntiguo);
	}
}
