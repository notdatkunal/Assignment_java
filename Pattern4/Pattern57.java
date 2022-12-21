import java.util.Scanner;

public class Pattern57 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt() + 1;

		int b = 0;
		char c = (char) (b + '0');
		char d = (char) (b + '1');
		for (i = 0; i <= length; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = length - i; j != 0; j--) {

				System.out.print(b++ % 2);
			}

			System.out.println();
		}
	}
}
