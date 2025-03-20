package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Manzana");
        fruits.add("Pera");
        fruits.add("Naranja");

        fruits.forEach(fruit ->{
            System.out.println("Fruta: " + fruit);
        });

        fruits.forEach(System.out::println);
    }
}
