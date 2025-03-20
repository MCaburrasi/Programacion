package _java.unidad6.teoría;

public class TeoríaBinarySearch {
    public static int binarySearch(int[] numbers, int objective){
        int found = -1;

        int i = 0, j = numbers.length - 1;

        while (i <= j) {
            int m = i + (j - i)/2;
            if (numbers[m] < objective)
                i = m + 1;
            else if (numbers[m] > objective) 
                j = m - 1;
            else {
                found = m;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 7, 13, 21, 55};
        int num = 21;
        int index = binarySearch(numbers, num);
        System.out.println("El numero " + num + " se encuentra en la posición: " + index);
    }
}