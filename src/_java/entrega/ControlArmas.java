package _java.entrega;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ControlArmas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		int caseNumber = 1;

		do {
			Map<String, Integer> map = new HashMap<>();
			List<Integer> list = new ArrayList<>();

			if (!first) {
				for (int i = 0; i < caseNumber; i++) {
					String name = sc.next();

					if (!name.equals("?")) {
						int gunQuant = sc.nextInt();
						if (!map.containsKey(name))
							map.put(name, gunQuant);
						else
							map.put(name, gunQuant + map.get(name));

					} else {
						int gunsOut = 0;
						int peopleQuant = sc.nextInt();

						for (int j = 0; j < peopleQuant; j++) {
							String nameOut = sc.next();
							gunsOut += map.get(nameOut);
							map.remove(nameOut);
						}
						list.add(gunsOut);
					}
				}

				for (Integer num : list) {
					System.out.println(num);
				}
				System.out.println("---");

			} else
				first = false;

			caseNumber = sc.nextInt();
		} while (caseNumber != 0);
		sc.close();
	}
}