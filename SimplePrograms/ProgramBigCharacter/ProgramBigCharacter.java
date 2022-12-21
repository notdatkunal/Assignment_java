import java.util.Scanner;

public class ProgramBigCharacter {
	public static void main(String[] args) {
		char a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two characters");
		a = input.next().charAt(0);
		b = input.next().charAt(0);
		c = a > b ? a : b;
		System.out.println(c + " is the larger character.");
	}
}