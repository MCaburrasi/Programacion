package _java.unidad10.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("test2.in"));
    }
}
