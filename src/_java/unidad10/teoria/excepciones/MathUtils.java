package _java.unidad10.teoria.excepciones;

public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException("No es posible hacer factorial de un numero negativo");
        } else if (n > 16) {
            throw new IllegalArgumentException("No es posible hacer factorial de un numero mayor a 16");
        }
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
