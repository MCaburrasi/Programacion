package _java.unidad5.teoría;

import java.util.Random;
import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        char nextQuestion;
        do {
            int num1 = rnd.nextInt(100) + 1;
            int num2 = rnd.nextInt(100) + 1;
            int operand = 4; //rnd.nextInt(4) + 1;
            double correctAnswer = 0;
            double guess;
            do {
                switch (operand) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = ?");
                        correctAnswer = num1 + num2;
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = ?");
                        correctAnswer = num1 - num2;
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = ?");
                        correctAnswer = num1 * num2;
                        break;
                    case 4:
                        System.out.println(num1 + " / " + num2 + " = ?");
                        correctAnswer = (double) num1 / num2;
                        break;
                }
                guess = sc.nextDouble();
                if (guess != correctAnswer) {
                    System.out.println("Respuesta Incorrecta\nIntenta de nuevo:");
                    System.out.println("");
                }

            } while (guess != correctAnswer);
            System.out.println("Correcto");
            System.out.println("¿Quieres Seguir? ('n' o 's')");
            System.out.println("");
            nextQuestion = sc.next().charAt(0);
        } while (nextQuestion != 'n');
        sc.close();
    }
}
