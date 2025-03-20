package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NextHasNext {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Manzana");
        list.add("Pera");
        list.add("Naranja");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String elemento = it.next();
            System.out.println(elemento);
        }
    }
}
