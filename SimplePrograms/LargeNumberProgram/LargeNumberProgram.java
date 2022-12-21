import java.util.Scanner;

public class LargeNumberProgram {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println((a > b ? a : b) + " is the large number.");
	}
}