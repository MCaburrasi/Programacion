package _java.unidad6.clases.tests;

import _java.unidad6.clases.comparators.PlayerComparator;
import _java.unidad6.clases.classes.Player2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Player2Sort {
    public static void main(String[] args) {
        List<Player2> lista = new ArrayList<>();
        lista.add(new Player2 ("Iker Casillas", Player2.PORTERO,3));
        lista.add(new Player2("Jesús Navas", Player2.DELANTERO, 10));
        lista.add(new Player2("Xabi Alonso", Player2.CENTROCAMPISTA,4));
        lista.add(new Player2("Sergio Ramos", Player2.DEFENSA, 2));
        lista.add(new Player2("Alvaro Arbeloa", Player2.DEFENSA, 1));
        lista.add(new Player2("Andrés Iniesta", Player2.CENTROCAMPISTA, 12));
        lista.add(new Player2("David Villa", Player2. DELANTERO, 15));
        lista.add(new Player2("Fernando Torres", Player2.DELANTERO, 2));
        lista.add(new Player2("José Manuel Reina", Player2. PORTERO, 1));
        lista.add(new Player2("Roberto Soldado", Player2. DELANTERO, 12));
        lista.add(new Player2("Santiago Cazorla", Player2.CENTROCAMPISTA, 5));
        lista.add(new Player2("Jordi Alba", Player2. DEFENSA, 2));
        lista.add(new Player2("Cesc Fabregas", Player2.CENTROCAMPISTA, 4));

        Collections.sort(lista, new PlayerComparator());
        lista.forEach((n) -> System.out.println(n));
    }
}