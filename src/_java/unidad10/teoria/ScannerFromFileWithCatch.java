package _java.unidad10.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            System.out.println(in.nextLine());
        } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
            System.out.println("Archivo no encontrado");
        }
    }
}
