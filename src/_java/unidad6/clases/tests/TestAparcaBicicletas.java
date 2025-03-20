package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Parking;
import _java.unidad6.clases.classes.District;
import _java.unidad6.clases.classes.ParkingManager;

import java.util.Scanner;

public class TestAparcaBicicletas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ParkingManager pmse = new ParkingManager();

		District cascoAntiguo = new District("Casco_Antiguo");
		District sanPabloSantaJusta = new District("San Pablo_Santa Justa");
		District nervion = new District("Nervion");
		District triana = new District("Triana");
		District bellavistaLaPalmera = new District("Bellavista_La Palmera");
		District macarenaNorte = new District("Macarena_Norte");

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

		Parking spsj1 = new Parking(5.976952420987936,37.394906910666272,37, sanPabloSantaJusta,5, "SI");
		sanPabloSantaJusta.getParking().add(spsj1);
		Parking spsj2 = new Parking(5.974161355400184,37.398237596588778,35,sanPabloSantaJusta,6, "SI");
		sanPabloSantaJusta.getParking().add(spsj2);

		Parking nervion1 = new Parking(5.984378793441746,37.381021630040884,43,nervion,6, "SI");
		nervion.getParking().add(nervion1);

		Parking triana1 = new Parking(6.008781528134852,37.403286511420987,45,triana,6,"SI");
		triana.getParking().add(triana1);

		Parking bvlp1 = new Parking(5.987673813903903,37.365865796207714,1,bellavistaLaPalmera,5,"SI");
		bellavistaLaPalmera.getParking().add(bvlp1);
		Parking bvlp2 = new Parking(5.989712989598854,37.36399876830852,3,bellavistaLaPalmera,3,"SI");
		bellavistaLaPalmera.getParking().add(bvlp2);
		Parking bvlp3 = new Parking(5.98696594146001,37.363689615420029,5,bellavistaLaPalmera,6,"SI");
		bellavistaLaPalmera.getParking().add(bvlp3);

		Parking mcn1 = new Parking(5.971849990174137,37.420642905776361,28,macarenaNorte,3,"SI");
		macarenaNorte.getParking().add(mcn1);
		Parking mcn2 = new Parking(5.969343690531444,37.42291017796061,25,macarenaNorte,3,"NO");
		macarenaNorte.getParking().add(mcn2);
		Parking mcn3 = new Parking(5.968788531685851,37.422107580018007,26,macarenaNorte,3,"SI");
		macarenaNorte.getParking().add(mcn3);

		pmse.getDistrict().add(cascoAntiguo);
		pmse.getDistrict().add(sanPabloSantaJusta);
		pmse.getDistrict().add(nervion);
		pmse.getDistrict().add(triana);
		pmse.getDistrict().add(bellavistaLaPalmera);
		pmse.getDistrict().add(macarenaNorte);

		pmse.reportPrint();
	}
}
