import java.util.Scanner;

public class Characters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter starting point");
        char i = in.next().charAt(0);
        System.out.println("enter your ending point");
        char s = in.next().charAt(0);
        while (i <= s) {
            System.out.print(i + " ");
            i++;
        }
    }
}
