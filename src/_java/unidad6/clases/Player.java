package _java.unidad6.clases;

public class Player {
    private String nombre;
    private int posicion;
    private int goles;
    private String[] posiciones;

    public static final int PORTERO = 0;
    public static final int DEFENSA = 1;
    public static final int CENTROCAMPISTA = 2;
    public static final int DELANTERO = 3;



    public Player(String nombre, int posicion, int goles) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
        this.posiciones = new String[] {"Portero", "Defensa", "Centrocampista", "Delantero"};
    }

    
}
