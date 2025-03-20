package _java.entrega;
import java.math.BigInteger;
import java.util.Scanner;

public class CuantasMeLLevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num1 = sc.next();
            String num2 = sc.next();
            if ((num1.equals("0")) && (num2.equals("0")))
                break;
            BigInteger bigInteger1 = new BigInteger(num1);
            BigInteger bigInteger2 = new BigInteger(num2);
            int carry = 0;
            int position = 0;
            int comparasion;
            BigInteger added = BigInteger.ZERO;
            while (num1.length() > position - 1 || num2.length() > position - 1) {
                comparasion = bigInteger1.remainder(BigInteger.TEN).add((bigInteger2.remainder(BigInteger.TEN))).add(added).compareTo(BigInteger.TEN);
                if (comparasion == 1 || comparasion == 0){
                    carry++;
                    added = BigInteger.ONE;
                } else 
                    added = BigInteger.ZERO;
                position++;
                bigInteger1 = bigInteger1.divide(BigInteger.TEN);
                bigInteger2 = bigInteger2.divide(BigInteger.TEN);
            }
            
                System.out.println(carry);
        }
        sc.close();
    }
}