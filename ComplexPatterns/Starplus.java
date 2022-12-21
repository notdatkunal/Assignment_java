import java.util.Scanner;

public class Starplus {
    public static void main(String[] args) {
        int i, j, a;
        boolean b;
        Scanner in = new Scanner(System.in);
        a = in.next().charAt(0);
        for (i = 97; i <= a; i++) {
            for (j = 97; j <= a; j++) {
                b = j % 2 == 0 ? true : false;
                System.out.print(b ? '+' : '*');
            }
            System.out.println();
        }
    }
    // right angled triangle
}