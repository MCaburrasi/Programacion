package _java.entrega;
import java.util.Scanner;

public class AburrimientoEnLaAutopista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < iterations; i++) {
            int older = 0;
            int newer = 0;
            boolean first = true;
            String licensePlate = " ";
            String userLicensePlate = " ";

            while (!licensePlate.equals("0")) {
                licensePlate = sc.next();
                if (!licensePlate.equals("0")) {
                    if (first) {
                        userLicensePlate = licensePlate;
                        first = false;
                    } else {
                        int comp = licensePlate.substring(4).compareTo(userLicensePlate.substring(4));
                        if (comp < 0)
                            older++;
                        else if (comp > 0)
                            newer++;
                        else {
                            comp = licensePlate.substring(0, 4).compareTo(userLicensePlate.substring(0, 4));
                            if (comp < 0)
                                older++;
                            else
                                newer++;
                        }

                    }
                }
            }
            System.out.println(older + " " + newer);
       } 
       sc.close();
    }
}