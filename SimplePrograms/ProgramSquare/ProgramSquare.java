
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSquare {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, user. Please enter any numbers ");
		a = input.nextInt();
		b = a % 10;
		c = b % 2 == 0 ? (b * b) : (b * b * b);
		System.out.println(c + " is the output.");
	}
}