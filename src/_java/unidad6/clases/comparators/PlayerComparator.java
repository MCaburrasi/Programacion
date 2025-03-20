package _java.unidad6.clases.comparators;

import _java.unidad6.clases.classes.Player2;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player2>{

    public int compare(Player2 p1, Player2 p2){
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
