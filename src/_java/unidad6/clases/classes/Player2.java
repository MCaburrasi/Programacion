package _java.unidad6.clases.classes;

public class Player2 {
    private String name;
    private int position;
    private int scores;
    private String[] positions;

    public static final int PORTERO = 0;
    public static final int DEFENSA = 1;
    public static final int CENTROCAMPISTA = 2;
    public static final int DELANTERO = 3;



    public Player2(String name, int position, int scores) {
        this.name = name;
        this.position = position;
        this.scores = scores;
        this.positions = new String[] {"Portero", "Defensa", "Centrocampista", "Delantero"};
    }

    @Override
    public String toString() {
        return name + ": " + this.positions[position] + " ha marcado " + scores + " scores";
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
