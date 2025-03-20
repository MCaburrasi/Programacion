package _java.entrega;

public class PascalTriangle {

    public static int triangle(int x, int y, int[][] pascal){
        if (y == x || y == 0){
            return 1;
        }

        if (pascal[x][y] != 0) {
            return pascal[x][y];
        }

        int num = triangle(x - 1, y-1, pascal) + triangle(x - 1, y, pascal);
        pascal[x][y] = num;
        return pascal[x][y];
    }

    public static void main(String[] args) {
        System.out.println(triangle(5, 2, new int[6][6]));
    }
}
