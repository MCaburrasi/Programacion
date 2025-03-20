package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Manzana");
        set.add("Plátano");
        set.add("Cereza");
        set.add("Naranja");
        set.add("Uva");

        List<String> list = new ArrayList<>(set);

        System.out.println("Contenido del ArrayList: ");
        list.forEach(System.out::println);
    }
}
