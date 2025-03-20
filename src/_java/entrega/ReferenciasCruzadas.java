package _java.entrega;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ReferenciasCruzadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frases;
        Map<String, Set<Integer>> map;
        while ((frases = sc.nextInt()) != 0) {
            sc.nextLine();
            map = new TreeMap<>();
                for (int i = 1; i < frases + 1; i++) {
                    String sentence = sc.nextLine();
                    String[] array = sentence.split(" ");
                    for (String word : array) {
                        if (word.length() > 2) {
                            if (!map.containsKey(word)) {
                                map.put(word, new LinkedHashSet<Integer>());
                            }
                            map.get(word).add(i);
                        }
                    }
                }
                
                for(String key : map.keySet()){
                    System.out.print(key);
                    Set<Integer> lines = map.get(key);
                    for (int line : lines) {
                        System.out.print(" " + line);
                    }
                    System.out.println();
                }
                System.out.println("----");
            }
        sc.close();    
    }
}

