package _java.unidad7y8.teoría;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        Collections.sort(numbers);
        System.out.println("Ordenado: " + numbers);
        
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Índice de 3: " + index);

        Collections.reverse(numbers);
        System.out.println("Revertido: " + numbers);

        System.out.println("Máximo: " + Collections.max(numbers));
        System.out.println("Mínimo: " + Collections.min(numbers));
    }
}
