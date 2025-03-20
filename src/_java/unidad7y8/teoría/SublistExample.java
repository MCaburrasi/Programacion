package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        List<String> subList = new ArrayList<>(list.subList(1, 4));

        System.out.println("Sublista: " + subList);

        subList.set(1, "Z");

        System.out.println("Lisa original: " + list);
    }
}
