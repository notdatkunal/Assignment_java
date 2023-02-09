import java.util.Scanner;

public class Pattern58 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt() + 1;
		int a = 0;

		for (i = 0; i <= length; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = length - i; j != 0; j--) {
				if (i % 2 != 0) {
					System.out.print(a);
				} else {

					System.out.print("*");
				}
			}
			a = i % 2 != 0 ? 1 : a + 1;

			System.out.println();
		}
	}
}
