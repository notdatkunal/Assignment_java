
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSmall {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, user. Please enter two numbers ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a < b ? (a) : (b);
		System.out.println(c);
	}
}