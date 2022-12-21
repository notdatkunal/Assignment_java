import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i, j, length;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your length");
        length = in.nextInt() - 1;

        for (i = 0; i <= length; i++) {
            for (j = 0; j <= length; j++) {
                if (i == 0 || i == length || j == 0 || j == length || i == j || j == length - i) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
