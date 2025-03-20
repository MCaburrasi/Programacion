package _java.unidad5.teoría;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("78.90");

        //Operaciones básicas
        BigDecimal suma = num1.add(num2);
        BigDecimal producto = num1.multiply(num2);

        //División con redondeo
        BigDecimal division = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("División (Redondeada a 2 decimales): " + division);
    }
}