import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            if (i > 1) {

                for (int k = 1; k <= i - 1; k++) {
                    System.out.print("* ");

                }
            }
            System.out.println();

        }
    }

}