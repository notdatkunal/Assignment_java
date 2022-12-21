import java.util.Scanner;

public class Kunal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter either 1 or 2");
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hi");
                break;
            default:
                System.out.println("please enter either 1 or 2");
        }
    }
}