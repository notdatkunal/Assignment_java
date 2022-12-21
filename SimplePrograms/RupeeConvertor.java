import java.util.Scanner;

public class RupeeConvertor {
    public static void main(String[] args) {
        Double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your amount in rupees");
        a = in.nextDouble();
        b = a / 81.7;
        System.out.println("You have " + b + " $ (dollars)");
    }
}