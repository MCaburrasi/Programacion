package _java.unidad0.actividades;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int player = 0;
        int cpu = 0;
        int draw = 0;
        int rounds = 0;
        char input = ' ';
        int randNum = 0;
        char cpuInput = ' ';
        String cpuShow = " ";
        do {
            rounds ++;
            System.out.print("Tu turno (Teclea t para tijeras, p para papel, x para piedra, s para salir): ");
            input = sc.next().charAt(0);

            if (input != 's') {
                randNum = random.nextInt(3) + 1;
                switch (randNum) {
                    case 1:
                        cpuInput = 'x';
                        cpuShow = "Piedra";
                        break;            
                    case 2:
                        cpuInput = 'p';
                        cpuShow = "Papel";
                        break;
                    case 3:     
                        cpuInput = 't';
                        cpuShow = "Tijeras";
                        break;
                    }
                System.out.println("Mi turno (Ordenador): " + cpuShow);
                
                if (input == 'x' && cpuInput == 'p' || input == 'p' && cpuInput == 't' || input == 't' && cpuInput == 'x') {
                    System.out.println("¡Has perdido!");
                    cpu ++;
                } else if (input == 'p' && cpuInput == 'x' || input == 't' && cpuInput == 'p' || input == 'x' && cpuInput == 't') {
                    System.out.println("¡Enhorabuena, has ganado!");
                    player ++;
                } else {
                    System.out.println("¡Empate!");
                    draw ++;
                }
            }
        } while (input != 's');
        rounds --;
        System.out.println("Estadisticas");
        System.out.println("-------------");
        System.out.println("");
        System.out.println("Numero de partidas: " + rounds);
        System.out.println("Yo gané " + cpu + " (" + (cpu*100/rounds) + "%)");
        System.out.println("Tú ganaste " + player + " (" + (player*100/rounds) +"%)");
        System.out.println("Hemos empatado " + draw + " (" + (draw*100/rounds) + "%)");
        System.out.println("Adios");
        sc.close();
    }
}
