package _java.entrega;
import java.util.Scanner;

public class CodigoDeBarras {
    public static void main(String[] args) {
        final int BULGARIA = 380;
        final int INGLATERRA = 50;
        final int IRLANDA = 539;
        final int PORTUGAL = 560;
        final int NORUEGA = 70;
        final int VENEZUELA = 759;
        final int CUBA = 850;
        final int INDIA = 890;
        final int EEUU = 0;

        Scanner sc = new Scanner(System.in);
        String barcode = " ";
        while (!barcode.equals("0")) {
            barcode = sc.nextLine();
            int length;
            int sum = 0;
            int lastNum = 0;
            boolean odd = true;
            String barcodeCopy = barcode;

            if (!barcode.equals("0")) {
                if (barcode.length() <= 8)
                    length = 8;
                else
                    length = 13;
    
                while (barcode.length() < length) {
                    barcode = "0" + barcode;
                }

                for (int i = barcode.length() - 2; i != -1; i--) {
                    if (odd) {
                        sum = sum + ((barcode.charAt(i) - 48) * 3);
                        odd = false;
                    } else {
                        sum = sum + (barcode.charAt(i) - 48);
                        odd = true;
                    }
                }
                lastNum = ((sum/10) * 10 + 10) - sum;
                boolean existence;

                if (lastNum == barcode.charAt(barcode.length() - 1) - 48 && barcode.length() <= 13) {
                    System.out.printf("SI ");
                    existence = true;
                }
                else {
                    System.out.println("NO");
                    existence = false;
                }
                
                if (barcode.length() == 13 && existence) {
                    int sufix3 = Integer.parseInt(barcodeCopy.substring(0, 3));
                    int sufix2 = Integer.parseInt(barcodeCopy.substring(0, 2));
                    int sufix1 = Integer.parseInt(barcodeCopy.substring(0, 1));
                    switch (sufix3) {
                        case BULGARIA:
                            System.out.println("BULGARIA");
                            break;
                        case IRLANDA:
                            System.out.println("IRLANDA");
                            break;
                        case PORTUGAL:
                            System.out.println("PORTUGAL");
                            break;
                        case VENEZUELA:
                            System.out.println("VENEZUELA");
                            break;
                        case CUBA:
                            System.out.println("CUBA");
                            break;
                        case INDIA:
                            System.out.println("INDIA");
                            break;
                        default:
                            switch (sufix2) {
                                case INGLATERRA:
                                    System.out.println("INGLATERRA");
                                    break;
                                case NORUEGA:
                                    System.out.println("NORUEGA");
                                    break;
                                default:
                                    if (sufix1 == EEUU)
                                        System.out.println("EEUU");
                                    else
                                        System.out.println("DESCONOCIDO");
                            }
                    }
                }             
            }
        }
        sc.close();          
    }
}