package _java.unidad0.teoría;

public class Prueba {
    public static void main(String[] args) {
        byte age = 32;
        short year = 2018;
        int id = 1234;
        long msHours = 77722349;

        float heigth = 1.80F;
        double result = 932.45690872;

        boolean isTrue;
        char letter;

        isTrue = false;
        letter = 'a';

        System.out.println("Edad: " + age);
        System.out.println("Año: " + year);
        System.out.println("Identificador: " + id);
        System.out.println("Hora en milisegundos: " + msHours);

        System.out.println("Estatura: " + heigth);
        System.out.println("Resultado: " + result);

        System.out.println("Es cierto: " + isTrue);
        System.out.println("Letra: " + letter);

        String name = "Francisca";

        int nameLength = name.length();
        System.out.println("Nombre: " + name + " tiene " + nameLength + " caracteres");

        int position = name.indexOf("a");
        System.out.println("Nombre: " + name + " tiene la letra 'a' en la posición " + position);

        System.out.println("Empieza por: " + name.substring(0,4));
        System.out.println("Termina por: " + name.substring(4));

        double capital = 500.0;
        double interest = 6.25;

        double simpleRent;

        simpleRent = capital * interest / 100;
        capital += simpleRent;

        System.out.println("Intereses = " + simpleRent);
        System.out.println("Acumulado = " + capital);
    }
}