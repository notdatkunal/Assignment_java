
// an if loop program which recoginzes if a number is even or odd
// this one without loops
import java.util.Scanner;

class ProgramSmallThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, user. Please enter three numbers ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = a > b ? (a) : (b);
		int e = d > c ? d : c;
		System.out.println(e + " is the largest number");
	}
}