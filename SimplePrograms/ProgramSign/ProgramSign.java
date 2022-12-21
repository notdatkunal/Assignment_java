
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSign {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, user. Please enter a number ");
		int a = in.nextInt();
		int b = a < 0 ? (0) : (1);
		System.out.println(b);
	}
}