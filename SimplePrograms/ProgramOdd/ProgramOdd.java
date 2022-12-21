
import java.util.Scanner;

class ProgramOdd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, user. Please enter a number ");
		int a = in.nextInt();
		String b = a % 2 == 0 ? ("hi") : ("bye");
		System.out.println(b);
	}
}