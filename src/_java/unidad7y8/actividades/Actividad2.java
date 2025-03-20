package _java.unidad7y8.actividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Actividad2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list1.add(rnd.nextInt(1000) + 1);
            list2.add(rnd.nextInt(1000) + 1);
            int list1num = list1.get(i);
            int list2num = list2.get(i);
            boolean comp = list1num > list2num;
            
            // comp ? list3.add(list1num) : list3.add(list2num);

            if (comp)
                list3.add(list1num);
            else
                list3.add(list2num);
        }

        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 2: " + list2);
        System.out.println("Lista 3: " + list3);
    }
}
