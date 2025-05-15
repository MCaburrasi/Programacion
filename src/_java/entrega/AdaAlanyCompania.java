package _java.entrega;

import java.util.Scanner;

public class AdaAlanyCompania {
    public static boolean isPalindrome(int i, int j, String sent){
        String word;

        if (j >= sent.length()){
            return false;
        }

        word = sent.substring(i, j+1);
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().equals(word);
    }

    public static int longestPalindrome(String word) {
        int i = 0;
        int j = i + 1;
        int longPal = 1;
        boolean lastPal = false;
        boolean cont = false;

        while (j < word.length()) {
            if (i >= 0 && (isPalindrome(i, j, word) || isPalindrome(i, j + 1, word))) {

                if (isPalindrome(i, j + 1, word))
                    j = j + 1;

                if ((j < word.length()) && isPalindrome(i, j, word)) {
                    if (j - i + 1 > longPal)
                        longPal = j - i + 1;
                }

                i--;
                j++;
                lastPal = true;

            } else if (lastPal){
                i = j - 1;
                j = i + 1;
                lastPal = false;
            } else {
                i++;
            }
        }

        return longPal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longPal;
        while (sc.hasNextLine()){
            String word = sc.nextLine();
            longPal = longestPalindrome(word);
            System.out.println(longPal);
        }
    }
}
