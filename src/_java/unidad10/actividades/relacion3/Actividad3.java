package _java.unidad10.actividades.relacion3;

import _java.unidad10.actividades.relacion3.excepciones.NullDenominatorException;

public class Actividad3 {
    private int numerator;
    private int denominator;

    public Actividad3(int numerator, int denominator) throws NullDenominatorException {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0){
            throw new NullDenominatorException("Denominador no puede ser negativo");
        }
    }
}
