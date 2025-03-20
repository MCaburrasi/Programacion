package _java.unidad6.teoría;

public class PrintShapes {
    public static void squarePattern(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void checkerPattern(int size){
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0)
                System.out.print(" ");

            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5;
        squarePattern(size);
        System.out.println();
        checkerPattern(size);
    }
}
