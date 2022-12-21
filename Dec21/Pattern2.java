import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j, length;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your length");
        length = in.nextInt() + 1;

        for (i = 0; i <= length; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");
            }

            System.out.print("* ");

            System.out.println();
        }
    }
}
