package _java.unidad10.actividades.relacion3;

import _java.unidad10.actividades.relacion3.excepciones.BinaryFormatException;

public class Actividad4 {
    public static int bin2dec(String binaryString) throws BinaryFormatException{
        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--){
            char digit = binaryString.charAt(i);
            if (digit != '0' && digit != '1')
                throw new BinaryFormatException("El numero ingresado no es binario");
            else if (digit == '1')
                decimal += Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}
