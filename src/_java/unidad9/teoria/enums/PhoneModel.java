package _java.unidad9.teoria.enums;

import java.util.Set;
import java.util.TreeSet;

public enum PhoneModel {
	IPHONE(9999), HUAWEI(8888), PIXEL(6666), SAMSUNG(9399), LG(5588);

	private int price;

	PhoneModel(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
