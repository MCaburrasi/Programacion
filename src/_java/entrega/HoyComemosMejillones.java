package _java.entrega;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoyComemosMejillones {

    public static int binarySearchReplace (List<Long> mussles, long num){
        int i = 0, j = mussles.size() - 1;
        int chosenPileIndex = -1;
        while (i <= j) {
            int half = (i + j) / 2;

            if (mussles.get(half) <= num)
                i = half + 1;

            else {
                chosenPileIndex = half;
                j = half - 1;
            }
        }
        return chosenPileIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            List<Long> mussles = new ArrayList<>();
            int mussleQuant = sc.nextInt();

            for (int i = 0; i < mussleQuant; i++) {
                long mussleSize = sc.nextInt();

                if (mussles.size() == 0) 
                    mussles.add(mussleSize);
                else {
                    int chosenPileIndex = binarySearchReplace(mussles, mussleSize);

                    if (chosenPileIndex == -1)
                        mussles.add(mussleSize);
                    else
                        mussles.set(chosenPileIndex, mussleSize);  
                }
            }
            System.out.println(mussles.size());
        }
        sc.close();
    }
}
