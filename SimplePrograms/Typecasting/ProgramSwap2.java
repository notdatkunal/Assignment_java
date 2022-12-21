
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSwap2 {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, user. Please enter first number ");
		a = input.nextInt();
		System.out.println("Hello, user. Please enter second number ");
		b = input.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("your entered numbers are");
		System.out.println(a);
		System.out.println(b);
	}
}