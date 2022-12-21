
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSwap {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, user. Please enter first number ");
		a = input.nextInt();
		System.out.println("Hello, user. Please enter second number ");
		b = input.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("you entered numbers are");
		System.out.println(a);
		System.out.println(b);
	}
}