package _java.unidad5.teoría;
public class MaxDeTres {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 100) + 1;
        int random2 = (int) (Math.random() * 100) + 1;
        int random3 = (int) (Math.random() * 100) + 1;
        int max1 = Math.max(random1, random2);
        int max2 = Math.max(max1, random3);
        System.out.println("Maximo de " + random1 + ", " + random2 + ", " + random3 + " es: " + max2);
    }
}
