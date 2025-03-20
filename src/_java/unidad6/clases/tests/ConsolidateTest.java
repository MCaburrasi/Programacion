package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Account2;

public class ConsolidateTest {
    public static void main(String[] args) {
        Account2 acc1 = new Account2 (1, "Name 1",100);
        Account2 acc2 = new Account2 (2, "Name 2",100);
        Account2 acc3 = new Account2 (3,"Name 3",100);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(" ");

        acc1.close();
        acc2.setName("Name 3");
        Account2 acc4 = Account2.consolidate(acc2,acc3);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
    }
}
