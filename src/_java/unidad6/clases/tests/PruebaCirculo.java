package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Circle;

public class PruebaCirculo {
    public static void main(String[] args) {
        //Prueba del tercer constructor (radio + color)
        Circle c1 = new Circle(2.0, "azul");
        System.out.println("=== Círculo c1 ===");
        System.out.println("El radio es: " + c1.getRadio());
        System.out.println("El color es: " + c1.getColor());
        System.out.printf("El area es: %.2f%n%n", c1.getArea());

        //Prueba del tercer constructor (radio + color)
        Circle c2 = new Circle(2.0);
        System.out.println("=== Círculo c2 ===");
        System.out.println("El radio es: " + c2.getRadio());
        System.out.println("El color es: " + c2.getColor());
        System.out.printf("El area es: %.2f%n%n", c2.getArea());

        //Prueba del tercer constructor (radio + color)
        Circle c3 = new Circle();
        System.out.println("=== Círculo c3 ===");
        System.out.println("El radio es: " + c3.getRadio());
        System.out.println("El color es: " + c3.getColor());
        System.out.printf("El area es: %.2f%n%n", c3.getArea());

        //Bonus: Uso del construcyor de copia y toString()
        Circle copia = new Circle(c1);
        System.out.println("=== Círculo copia (de c1) ===");
        System.out.println(copia);
    }
}
