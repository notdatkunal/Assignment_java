import java.util.Scanner;

public class Pattern51 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt();
		char a = 'A';
		for (i = 0; i <= length; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = length - i; j != 0; j--) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
