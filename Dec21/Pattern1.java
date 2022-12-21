import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Pattern1 {
    public static void main(String[] args) {
        int i, j, length;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your length");
        length = in.nextInt() + 1;

        for (i = 0; i <= length; i++) {

            for (j = 0; j <= length; j++) {
                if (i == 0 || i == length) {
                    System.out.print("* ");
                } else if (j == 0 || j == length) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}
