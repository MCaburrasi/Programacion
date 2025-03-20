package _java.unidad7y8.teoría;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapaExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);

        System.out.println("Recorriendo claves: ");
        for (String key : map.keySet()) {
            System.out.println("Clave: " + key);
        }

        System.out.println("\nRecorriendo claves con Iterator: ");
        Iterator<String> iteratorKeys = map.keySet().iterator();
        while (iteratorKeys.hasNext()) {
            System.out.println("Clave: " + iteratorKeys.next());
        }

        System.out.println("\nRecorriendo valores: ");

        for (Integer value : map.values()) {
            System.out.println("Valor " + value);
        }

        System.out.println("\nRecorriendo valores con Iterator: ");
        Iterator<Integer> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println("Valor: " + valueIterator.next());
        }

        System.out.println("\nRecorriendo valores con forEach y operador ::");
        map.values().forEach(System.out::println);

        System.out.println("\nRecorriendo entradas: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println("\nRecorriendo entradas con Iterator: ");
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println("\nRecorriendo entradas con forEach y lamba: ");
        map.forEach((key, value) -> System.out.println("Clave: " + key + ", Valor: " + value));
    }
}
