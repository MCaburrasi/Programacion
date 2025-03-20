package _java.unidad7y8.actividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        char election = 's';
        while (election == 's') {
            System.out.print("Añade un numero: ");
            int num = sc.nextInt();
            list.add(num);
            System.out.print("¿Quieres añadir mas numeros? (s,n): ");
            election = sc.next().charAt(0);
        }
        
        int election2 = 1;
        while (election2 != 6) {
            System.out.println("");
            System.out.println("¿Que desea hacer? (1-6): ");
            System.out.println("1: Mostrar Lista");
            System.out.println("2: Mostrar mayor, menor y media");
            System.out.println("3: Borrar un elemento en un indice concreto");
            System.out.println("4: Borrar un elemento de un valor concreto");
            System.out.println("5: Añadir un elemento al final");
            System.out.println("6: Salir");
            System.out.print("> ");
            election2 = sc.nextInt();

            switch (election2) {
                case 1:
                    System.out.println("Lista: " + list);
                    break;
                
                case 2:
                    int max = Collections.max(list);
                    int min = Collections.min(list);
                    int sum = 0;
                    for (int num : list) {
                        sum += num;
                    }
                    int average = sum/list.size();
                    System.out.println("Minimo: " + min + ", Máximo: " + max + ", Media: " + average);
                    break;

                case 3:
                    System.out.print("Escribe el indice del que borrar: ");
                    int index = sc.nextInt();
                    list.remove(index);
                    break;

                case 4:
                    System.out.print("Escribe el numero que quieres borrar: ");
                    int num = sc.nextInt();
                    list.remove(num);
                    break;

                case 5:
                    System.out.print("Escribe el numero que quieres añadir: ");
                    int numToAdd = sc.nextInt();
                    list.add(numToAdd);
                    break;
            }
        }
        

        sc.close();
    }
}