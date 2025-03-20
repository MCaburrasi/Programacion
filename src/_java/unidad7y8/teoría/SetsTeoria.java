package _java.unidad7y8.teoría;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsTeoria {
    public static void main(String[] args) {
        //Crear un HashSet
        Set<String> set = new HashSet<>();

        //Añadir elementos al HashSet
        set.add("Manzana");
        set.add("Plátano");
        set.add("Cereza");
        set.add("Naranja");
        set.add("Uva");

        //1. Recorrido con for-each
        System.out.println("Recorrido con for-each: ");
        for (String fruta : set) {
            System.out.println(fruta);
        }

        //2. Recorrido con while y Iterator
        System.out.println("\nRecorrido con while e Iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3. Recorrido con forEach usando el operador
        System.out.println("\nRecorrido con forEach: ");
        set.forEach(System.out::println);
    }
}
